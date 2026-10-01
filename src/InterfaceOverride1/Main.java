package InterfaceOverride1;

public class Main {
    public static void main(String[] args){          //1

        CashPayment cashPayment = new CashPayment();
        CardPayment cardPayment = new CardPayment();

        cashPayment.pay(100);
        cardPayment.pay(100);
    }
}
