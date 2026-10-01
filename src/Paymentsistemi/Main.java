package Paymentsistemi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {             //8

        List<Payment> payments = new ArrayList<>();

        payments.add(new CardPayment(100));
        payments.add(new CashPayment(200));
        payments.add(new OnlinePayment(300));

        for (Payment payment : payments) {

            try {

                payment.process(60);

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }
        }
    }
}