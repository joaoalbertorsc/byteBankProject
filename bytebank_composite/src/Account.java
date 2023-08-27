class Account01 {

    // toda conta tem um saldo
    // toda conta tem uma agencia
    // toda conta tem um numero
    // toda conta tem um titular
        private double balance;
        int agency;
        int number;
        Client holder;

        public void deposit(double value) {
            this.balance += value;
        }

        public boolean withdraw(double value) {
            if (this.balance >= value) {
                this.balance -= value;
                return true;
            } else {
                return false;
            }
        }

        public boolean transfer(double value, Account reciever) {
            if (this.balance >= value) {
                this.balance -= value;
                reciever.deposit(value);
                return true;
            } else {
                return false;
            }
        }

        public double getBalance(){
            return this.balance;
        }
}