public class Authenticator {

    private int key;

    public void setKey(int key) {
        this.key = key;
    }

    public boolean authentication(int key) {
        if (this.key == key) {
            return true;
        } else {
            return false;
        }
    }
}
