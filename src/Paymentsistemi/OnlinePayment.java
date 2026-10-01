package Paymentsistemi;

public class OnlinePayment implements Payment {         //8

    private int payment;

    public OnlinePayment(int payment) {
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

        if (amount > 10000) {
            throw new IllegalArgumentException("Online limit aşıldı");
        }

        System.out.println("Online payment: " + amount);
    }
}
