package Paymentsistemi;

public class CashPayment implements Payment {         //8

    private int payment;

    public CashPayment(int payment) {
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public void process(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Məbləğ 0-dan böyük olmalıdır");
        }

        if (amount > 3000) {
            throw new IllegalArgumentException("Nağd ödəniş limiti aşıldı");
        }

        System.out.println("Cash payment: " + amount);
    }
}