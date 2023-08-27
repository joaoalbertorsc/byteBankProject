public class InternalSystem implements Authenticable {

    private int key = 1234;

    public void authentication(Authenticable a) {

        boolean authenticationOk = a.authentication(this.key);
        if (authenticationOk) {
            System.out.println("Ok, key is correct. Loading...");
        } else {
            System.out.println("Not ok, key is wrong. Try again...");
        }
    }

    @Override
    public void setKey(int key) {

    }

    @Override
    public boolean authentication(int key) {
        return false;
    }
}
