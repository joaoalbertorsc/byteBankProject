public class Client implements Authenticable {

    private Authenticator authenticator;
    public Client(){
        this.authenticator = new Authenticator();
    }

    @Override
    public void setKey(int key) {
        this.authenticator.setKey(key);
    }

    @Override
    public boolean authentication(int key) {
        return this.authenticator.authentication(key);
    }
}
