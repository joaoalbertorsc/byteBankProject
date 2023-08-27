package br.com.bytebank.banco.model;

public class LifeInsurance implements Taxable {
    @Override
    public double getTax() {
        return 42;
    }
}
