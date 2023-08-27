public class TestSystem {

    public static void main(String[] args) {

        Manager m = new Manager();
        m.setKey(1234);

        Client alex = new Client();
        alex.setKey(1234);

        InternalSystem si = new InternalSystem();

        si.authentication(m);
        si.authentication(alex);

    }
}
