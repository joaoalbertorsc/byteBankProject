package br.com.bytebank.banco.model;

import java.io.Serializable;

public class AccountCurrent extends Account implements Taxable, Serializable {

    private TaxCalculator tax;

    public AccountCurrent(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }

    @Override
    public void withdraw(double value) throws Exception {
        double finalValue = value + 0.20;
        super.withdraw(finalValue);

    }

    @Override
    public double getTax() {
        return super.balance * 0.01;
    }

    @Override
    public String toString() {
        return "Conta corrente, " + super.toString();
    }
}
