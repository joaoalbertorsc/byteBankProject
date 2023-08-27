public class NegativeWithdraw {
    public static void main(String[] args) {

        // criando nova conta 'account'
        //
        Account account = new Account();

        // depositando valor a nova conta 'account'
        //
        account.deposit(100);

        // imprimindo resultado boolean do 'withdraw'
        // tentando sacar valor da conta 'account'
        System.out.println(account.withdraw(101));
        account.withdraw(101);

        // imprimindo o saldo atual
        // utilizando o getBalance para privar o balance e mante-lo encapsulado.
        System.out.println(account.getBalance());
    }
}
