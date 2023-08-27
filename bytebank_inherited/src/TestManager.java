public class TestManager {
    public static void main(String[] args) {

        Authenticable fulano = new Client();

        Manager jobert = new Manager();
        jobert.setName("Jobert");
        jobert.setCpf("992321323-09");
        jobert.setSalary(4000.0);

        System.out.println(jobert.getName());
        System.out.println(jobert.getCpf());
        System.out.println(jobert.getSalary());

        jobert.setKey(2222);
        boolean ok = jobert.authentication(2222);

        System.out.println(ok);

        System.out.println(jobert.getBonus());
    }
}
