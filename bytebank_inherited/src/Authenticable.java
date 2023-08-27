
// contrato 'Authenticable'
    // quem assinar esse conttrato, precisa implementar
        // metodo setKey
        // metodo authentication

public interface Authenticable {
    public abstract void setKey(int key);
    public abstract boolean authentication(int key);
}
