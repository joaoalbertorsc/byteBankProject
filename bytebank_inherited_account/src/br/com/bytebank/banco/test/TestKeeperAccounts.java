package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.KeeperAccounts;

public class TestKeeperAccounts {

    public static void main(String[] args) {

        KeeperAccounts keeper = new KeeperAccounts();

        Account cc0 = new AccountCurrent(12,23);
        keeper.add(cc0);

        Account cc1 = new AccountCurrent(12,22);
        keeper.add(cc1);

        int size = keeper.getAllElements();

        System.out.println(size);

        Account ref = keeper.getReference(0);
        System.out.println(ref.getNumber());


    }

}
