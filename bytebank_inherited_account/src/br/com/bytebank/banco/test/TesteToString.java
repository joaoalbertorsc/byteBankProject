package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.AccountSavings;

public class TesteToString {
    public static void main(String[] args) {

        Object cc = new AccountCurrent(22, 33);
        Object cp = new AccountSavings(33, 22);

        System.out.println(cc);
        System.out.println(cp);

    }
}
