public class TestReference {

        public static void main(String[] args) {

            // criando nova conta 'firstAccount'
            //
            Account firstAccount = new Account();

            // alterando o saldo da conta 'firstAccount'
            //
            firstAccount.balance = 300.0;
            System.out.println(firstAccount.balance);

            // adicionando valor ao saldo da conta 'firsAccount'
            //
            firstAccount.balance += 100.0;
            System.out.println(firstAccount.balance);


            if (firstAccount == firstAccount) {
                System.out.println("It's exactly the same account");
            }

        }

}
