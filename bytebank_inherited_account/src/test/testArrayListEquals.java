package test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;

import java.util.ArrayList;
import java.util.LinkedList;


/*
* Testing equals between two accounts...
* Make sure if it's the same account with a different name...
* */

public class testArrayListEquals {
    public static void main(String[] args) {

        ArrayList <Account> list = new ArrayList<Account>();

        Account cc0 = new AccountCurrent(7488,01);
        list.add(cc0);

        Account cc1 = new AccountCurrent(3351,02);
        list.add(cc1);

        boolean same = cc0.equals(cc1);
        System.out.println("same account? " + same);

        for (Account account : list) {
            System.out.println(account);
        }
    }
}
