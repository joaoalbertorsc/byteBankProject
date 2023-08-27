public class TestMethod {

        public static void main(String[] args) {
            // criando nova conta 'anaAccount'
            //
            Account anaAccount = new Account();

            // alterando saldo da conta 'anaAccount'
            //
            anaAccount.balance = 100.0;

            // adicionando valor na conta 'anaAccount'
            //
            anaAccount.deposit(50.0);

            // criando um boolean 'possibleWithdraw' para dar um resultado
            // true ou false à invocação withdraw da conta 'anaAccount'
            boolean possibleWithdraw = anaAccount.withdraw(20.0);
            System.out.println(anaAccount.balance);

            // criando nova conta 'marcelaAccount'
            //
            Account marcelaAccount = new Account();


            // adicionando saldo a conta 'marcelaAccount'
            //
            marcelaAccount.deposit(1000.0);

            // criando um boolean 'transferok' para validar a tranferencia
            // da conta 'marcelaAccount' para a conta 'anaAccount'
            boolean transferOk = marcelaAccount.transfer(300.0, anaAccount);

            // criando uma condição para prinrtar uma mensagem de acordo com a
            // resposta obtida atravez da invocação do método 'trasfer'
            if (transferOk) {
                System.out.println("Your transfer is ok!");
            } else {
                System.out.println("Not enough money in the account.");
            }

            // printanto os saldos finais de cada conta
            //
            System.out.println("Marcela's account balance now is:" + marcelaAccount.balance);
            System.out.println("Ana's account balance now is:" + anaAccount.balance);

            // adicionando 'String' ao atributo 'holder' se tornando o novo titular da conta 'anaAccount'
            //
            anaAccount.holder = "Ana Silveira";
            System.out.println(anaAccount.holder);
        }

}
