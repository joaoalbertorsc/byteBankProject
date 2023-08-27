package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.AccountSavings;

public class TestArrayReferencias {
    public static void main(String[] args) {

        Account[] accounts = new Account[5];

        AccountCurrent cc1 = new AccountCurrent(01,01);
        accounts[0] = cc1;

        AccountSavings cc2 = new AccountSavings(01,22);
        accounts[1] = cc2;

        System.out.println(accounts[1].getNumber());

        AccountSavings ref = (AccountSavings) accounts[1];

        System.out.println(cc2.getNumber());
        System.out.println(ref.getNumber());

    }
}
