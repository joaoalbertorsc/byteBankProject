package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.KeeperReferences;

public class TestKeeperReferences {

    public static void main(String[] args) {

        KeeperReferences keeper = new KeeperReferences();

        Account cc0 = new AccountCurrent(12,23);
        keeper.add(cc0);

        Account cc1 = new AccountCurrent(12,22);
        keeper.add(cc1);

        int size = keeper.getAllElements();

        System.out.println(size);

        Account ref = (Account) keeper.getReference(0);
        System.out.println(ref.getNumber());



    }

}
