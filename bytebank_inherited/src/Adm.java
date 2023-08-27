public class Adm extends Employee implements Authenticable {

    private Authenticator authenticator;

    public Adm(){
        this.authenticator = new Authenticator();
    }

    @Override
    public double getBonus() {
        return 0;
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
