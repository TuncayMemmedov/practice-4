package InterfaceOverride1;

public class CashPayment implements PaymentService{       //1

    @Override
    public void pay(double amount){
        System.out.println("Nağd ödəniş: " + amount);
    }

}
