package br.com.bytebank.banco.model;

public class NoBalanceException extends Exception {
    public NoBalanceException(String message) {
        super(message);
    }
}
