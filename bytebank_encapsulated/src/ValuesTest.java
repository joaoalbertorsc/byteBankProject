public class ValuesTest {
    public static void main(String[] args) {
        Account account = new Account(121, 3355);

        Account account1 = new Account(265, 32122);

        Account account2 = new Account(432, 33221);
        // construtor padrão:
        // '''public Conta() {
        //
        //    }'''
        //

        System.out.println("\nTotal accounts on Bytebank:" + Account.getTotal());
        System.out.println("\nAccount's number: "+ account.getNumber());

    }
}
