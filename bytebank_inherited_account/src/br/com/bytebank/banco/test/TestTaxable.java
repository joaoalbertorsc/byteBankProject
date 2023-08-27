package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.LifeInsurance;
import br.com.bytebank.banco.model.TaxCalculator;

public class TestTaxable {
    public static void main(String[] args) {
        AccountCurrent accountCurrent = new AccountCurrent(222,111);
        accountCurrent.deposit(1000.0);

        LifeInsurance lifeInsurance = new LifeInsurance();

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.register(accountCurrent);
        taxCalculator.register(lifeInsurance);

        System.out.println(taxCalculator.getTotalTax());
        System.out.println(accountCurrent.getBalance());
    }
}
