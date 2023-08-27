public class NoClientTest {
    public static void main(String[] args) {

        // criando nova conta 'marcelaAccount'
        //
        Account marcelaAccount = new Account();
        System.out.println(marcelaAccount.getBalance());

        // associando um novo cliente a 'marcelaAccount'
        //
        marcelaAccount.holder = new Client();
        System.out.println(marcelaAccount.holder);

        // alterando o nome do titular 'holder'
        // da conta 'marcelaAccount'
        marcelaAccount.holder.name = "Marcela";
        System.out.println(marcelaAccount.holder.name);
    }
}
