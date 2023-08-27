package br.com.bytebank.banco.model;

public class TaxCalculator {

    private double totalTax;
    public void register(Taxable t){
        double value = t.getTax();
        this.totalTax += value;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
