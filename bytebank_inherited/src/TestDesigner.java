public class TestDesigner {
    public static void main(String[] args) {

        Employee nico = new Designer();

        nico.setCpf("554323421-34");
        nico.setName("Nico Nico");
        nico.setSalary(5000.0);

        System.out.println(nico.getName());
        System.out.println("Nico bonus equals to " + nico.getBonus());

    }
}
