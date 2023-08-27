package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;

public class TestWithdraw {

    public static void main(String[] args) {

        Account s = new AccountCurrent(123, 3223);

        s.deposit(123);

        try {
            s.withdraw(124);
        } catch (Exception exception) {
            System.out.println("Ex: " + exception.getMessage());
        }
        System.out.println(s.getBalance());
    }
}
