package test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.AccountSavings;
import br.com.bytebank.banco.model.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

        Account  cc1 = new AccountCurrent(22, 33);
        Client clienteCC1 = new Client();
        clienteCC1.setName("Nico");
        cc1.setHolder(clienteCC1);
        cc1.deposit(333.0);

        Account  cc2 = new AccountSavings(22, 44);
        Client clienteCC2 = new Client();
        clienteCC2.setName("Guilherme");
        cc2.setHolder(clienteCC2);
        cc2.deposit(444.0);

        Account  cc3 = new AccountCurrent(22, 11);
        Client clienteCC3 = new Client();
        clienteCC3.setName("Paulo");
        cc3.setHolder(clienteCC3);
        cc3.deposit(111.0);

        Account  cc4 = new AccountSavings(22, 22);
        Client clienteCC4 = new Client();
        clienteCC4.setName("Ana");
        cc4.setHolder(clienteCC4);
        cc4.deposit(222.0);

        List<Account> list = new ArrayList<>();
        list.add(cc1);
        list.add(cc2);
        list.add(cc3);
        list.add(cc4);

        list.sort(
                (c1, c2) -> c1.getNumber() - c2.getNumber()
        );

        list.forEach((account) -> System.out.println(account + ", " + account.getHolder().getName()));


        Comparator<Account> comparator = (Account c1, Account c2) -> {
            String nameC1 = c1.getHolder().getName();
            String nameC2 = c2.getHolder().getName();
            return nameC1.compareTo(nameC2);
        };

        System.out.println("--------------------");

        list.sort(comparator);
        list.forEach((account) -> System.out.println(account + ", " + account.getHolder().getName()));
    }
}