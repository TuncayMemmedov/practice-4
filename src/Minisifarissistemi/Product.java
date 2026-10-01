package Minisifarissistemi;

public class Product implements OrderItem{          //10

    private String price;
    private String quantity;

    public Product(String price, String quantity){
        this.price = price;
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        double p = Double.parseDouble(price);
        double q = Double.parseDouble(quantity);

        return p * q;
    }
}
