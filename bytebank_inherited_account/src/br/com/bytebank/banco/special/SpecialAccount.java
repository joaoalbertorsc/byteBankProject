package br.com.bytebank.banco.special;

import br.com.bytebank.banco.model.Account;

public class SpecialAccount extends Account{

    public SpecialAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {

    }

}
