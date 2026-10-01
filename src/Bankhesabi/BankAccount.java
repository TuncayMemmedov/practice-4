package Bankhesabi;

public class BankAccount {         //6

    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void withdraw(double amount){

        if (amount <= 0){
            throw new IllegalArgumentException();
        } else if (amount > balance) {
            throw new IllegalStateException();
        }else {
            balance = balance - amount;
            System.out.println("Düzgün əməliyyat");
            System.out.println("Qalan balans: " + balance);
        }
    }

}
