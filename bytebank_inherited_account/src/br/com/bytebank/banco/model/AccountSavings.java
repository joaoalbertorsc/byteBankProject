package br.com.bytebank.banco.model;

public class AccountSavings extends Account {

    public AccountSavings(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }

    @Override
    public String toString() {
        return "Conta poupanca, " + super.toString();
    }
}
