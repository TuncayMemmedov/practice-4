package Minisifarissistemi;

public class Subscription implements OrderItem{          //10

    private String monthlyPrice;

    public Subscription(String monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public String getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(String monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    @Override
    public double calculatePrice() {
        return Double.parseDouble(monthlyPrice);
    }
}
