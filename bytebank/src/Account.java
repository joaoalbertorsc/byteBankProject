public class Account {
        double balance;
        int agency;
        int number;
        String holder;

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
                this.withdraw(value);
                reciever.deposit(value);
                return true;
            } else {
                return false;
            }
        }
}
