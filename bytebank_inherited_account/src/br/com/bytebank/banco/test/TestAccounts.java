package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.AccountSavings;
import br.com.bytebank.banco.model.Client;

public class TestAccounts {
    public static void main(String[] args) throws Exception {

        Account current01 = new AccountCurrent(111, 229);
        current01.deposit(100.0);
        System.out.println("Your balance: " + current01.getBalance());

        Account savings01 = new AccountSavings(929, 332);
        savings01.deposit(400.0);

        Client jobert = new Client();
        jobert.setName("Jobert");
        savings01.setHolder(jobert);

        System.out.println("Your balance: " + savings01.getBalance());

        current01.transfer(50.0, savings01);

        System.out.println(current01.getBalance());
        System.out.println(savings01.getBalance());

        current01.withdraw(10.0);
        System.out.println(current01.getBalance());
    }
}
