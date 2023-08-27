public class TestReference {

    public static void main(String[] args) {

        Manager paulo = new Manager();
        paulo.setName("Paulo");
        paulo.setSalary(5000.0);

        Employee leigo = new Designer();
        leigo.setSalary(3000.0);

        Employee asd = new VideoEditor();
        asd.setSalary(2000.0);

        BonusControl control = new BonusControl();

        control.register(paulo);

        System.out.println(asd.getBonus());
        System.out.println(paulo.getBonus());
        System.out.println(leigo.getBonus());
        System.out.println(control.getAdd());

        Employee alex = new Designer();
        alex.setSalary(2000.0);
        System.out.println(alex.getBonus());
    }

}
