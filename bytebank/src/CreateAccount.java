public class CreateAccount {
        public static void main(String[] args) {

            // criando a conta
            //
            Account firstAccount = new Account();

            //
            // alterando saldo a 'firstaccount'
            firstAccount.balance = 200.0;
            System.out.println(firstAccount.balance);

            //
            // adicioando mais saldo a 'firstaccount'
            firstAccount.balance += 100.0;
            System.out.println(firstAccount.balance);

            //
            // criando uma nova conta 'secondaccount'
            Account secondAccount = new Account();

            // alterando o saldo da conta 'secondaccount'
            //
            secondAccount.balance = 50.0;

            // imprimindo os saldos das duas contas 'firstaccount' e 'secondaccount'
            //
            System.out.println("First account have: " + firstAccount.balance);
            System.out.println("Second account have: " + secondAccount.balance);

            // criando nova conta 'joaoaccount'
            //
            Account joaoAccount = new Account();

            // alterando o saldo da conta 'joaoAccount'
            //
            joaoAccount.balance = 5.0E7;

            // printando saldo
            System.out.println("Antes do pix:" + joaoAccount.balance);

            // criando nova conta 'joseAccount'
            //
            Account joseAccount = new Account();

            // alterando saldo da conta joseAccount
            //
            joseAccount.balance = 5.45652132E8;

            // transferindo valor da conta 'joseAccount' para a conta 'joaoAccount'
            //
            joseAccount.transfer(1000000.0, joaoAccount);

            // printando novo saldo da conta 'joaoAccount'
            //
            System.out.println("\nDepois do pix:" + joaoAccount.balance);

            // condição que prova que joaoAccount e joseAccount são duas contas diferentes.
            //
            if (joseAccount == joaoAccount) {
                System.out.println("It's the same account.");
            } else {
                System.out.println("It's not the same account.");
            }

        }

}
