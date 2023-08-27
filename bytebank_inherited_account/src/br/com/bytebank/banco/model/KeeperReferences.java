package br.com.bytebank.banco.model;

public class KeeperReferences {

    private Object[] refs;
    private int freePosition;

    public KeeperReferences() {
        this.refs = new Object[10];
        this.freePosition = 0;
    }

    public void add(Object ref) {
        this.refs[this.freePosition] = ref;
        this.freePosition++;
    }

    public int getAllElements() {
        return this.freePosition;
    }

    public Account getReference(int i) {
        return (Account) this.refs[i];
    }
}
