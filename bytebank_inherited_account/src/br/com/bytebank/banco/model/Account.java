package br.com.bytebank.banco.model;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta;
 * @author Jobert
 */

public abstract class Account extends Object implements Comparable<Account>, Serializable {

    // toda conta tem um saldo
    // toda conta tem uma agencia
    // toda conta tem um numero
    // toda conta tem um titular

    // private = encapsulamento de codigo
    // dificultando o acesso diretamente ao atributo
    //
    protected double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;


    // passar parametro, 'obrigando' o usuário a
    // inserir os dados 'agency' e 'number' para poder criar uma nova conta.
    public Account(int agency, int number) {

        Account.total++;
        this.agency = agency;
        this.number = number;
        System.out.println("Creating your account number: " + this.agency + " on ByteBank...");
    }

    // alterando o numero da agencia da conta, e alterando o numero da conta.
    // com os valores de entrara recebidos pelos parametros
    // sendo ambos int. Um para a 'agency' e outro para o 'number'.

    public abstract void deposit(double value);

    public void withdraw(double value) throws Exception {

        if (this.balance < value) {
            throw new NoBalanceException("Balance: " + this.balance + ", Value: " + value);
        }
        this.balance -= value;
    }

    // método para retirada de valor da conta 'this.balance' sendo assim
    // a retirada é feita se o valor for menor que o 'balance' atual.
    // o 'value' é o valor que o método 'withdraw' recebe como parametro.

//        if (this.balance >= value) {
//            this.balance -= value;
//            return true;
//        } else {
//            return false;
//        }
//    }

    public void transfer(double value, Account receiver) throws Exception {
        this.withdraw(value);
        receiver.deposit(value);
    }

    // o método transfer recebe dois parametros para ser invocado.
    // sendo eles o 'value' que é o valor a ser transferido.
    // e o objeto 'modelo.Account reciever' [receiver é uma var desse metodo - nasce e morre aqui]
    // que é a conta que receberá a transferencia.

//        if (this.balance >= value) {
//
//            // condição para que a transferencia ocorra
//            // sendo o balance maior ou igual ao valor que será transferido.
//
//            this.balance -= value;
//
//            // invocando o método 'receiver.deposit' para concluir a operação de trasferencia
//            // do valor de uma conta para a outra.
//
//            reciever.deposit(value);
//            System.out.println("Your transfer to " + reciever.holder.getName() + " of $" + value + " is completed.");
//            return true;
//        } else {
//            return false;
//        }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 0) {
            System.out.println("Error, value under 0 is not available");
            return;
        }
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if (number >= 0) {
            System.out.println("Agency number under 0 does`t exist.");
            return;
        }
        this.agency = agency;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return holder;
    }

    public static int getTotal() {
        return Account.total;
    }

    @Override
    public boolean equals(Object ref) {

        Account account = (Account) ref;

        if (this.agency != account.agency) {
            return false;
        }
        if (this.number != account.number) {
            return false;
        }
        return true;

    }

    @Override
    public int compareTo(Account other) {
        return Double.compare(this.balance, other.balance);
    }
    @Override
    public String toString() {
        return "Numero: " + this.number + ", Agencia: " + this.agency + " Balance: R$" + this.balance;
    }


}