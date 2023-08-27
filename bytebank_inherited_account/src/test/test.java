package test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList <Account> list = new ArrayList<Account>();

        Account cc0 = new AccountCurrent(12,01);
        list.add(cc0);

        Account cc1 = new AccountCurrent(12,02);
        list.add(cc1);

        Account cc2 = new AccountCurrent(20,03);
        list.add(cc2);

        Account cc3 = new AccountCurrent(20,04);
        list.add(cc3);

        System.out.println("Size: " + list.size());
        Account ref = list.get(0);
        System.out.println(ref.getNumber());

        list.remove(0);

        System.out.println("Size: " + list.size());

        for (Account account : list) System.out.println(account);

        System.out.println("------");

        System.out.println(list.get(0));

    }
}
