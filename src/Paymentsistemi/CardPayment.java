package Paymentsistemi;

public class CardPayment implements Payment{           //8

    int payment;

    public CardPayment(int payment){
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

        if (amount > 5000){
            throw new IllegalArgumentException("Kart limiti aşıldı");
        }
        System.out.println("Card payment: " + amount);
    }
}
