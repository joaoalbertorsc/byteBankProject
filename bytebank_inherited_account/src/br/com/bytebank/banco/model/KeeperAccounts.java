package br.com.bytebank.banco.model;

public class KeeperAccounts {

    private Account[] refs;
    private int freePosition;

    public KeeperAccounts() {
        this.refs = new Account[10];
        this.freePosition = 0;
    }

    public void add(Account ref) {
        this.refs[this.freePosition] = ref;
        this.freePosition++;
    }

    public int getAllElements() {
        return this.freePosition;
    }

    public Account getReference(int i) {
        return this.refs[i];
    }
}
