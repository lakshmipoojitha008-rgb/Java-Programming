class BankAccount {

    String name;
    int balance;
    int deposit_amount;

    BankAccount(String name, int balance, int deposit_amount) {
        this.name = name;
        this.balance = balance;
        this.deposit_amount = deposit_amount;
    }

    void show_balance() {
        if (balance < 500) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String args[]) {

        BankAccount B1 = new BankAccount("poojitha", 10000, 1000);

        B1.show_balance();
    }
}