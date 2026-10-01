package InterfaceOverride1;

public class CardPayment implements PaymentService{          //1

    @Override
    public void pay(double amount){
        System.out.println("Kartla ödəniş: " + amount);
    }
}
