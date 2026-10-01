package Minisifarissistemi;

public class DiscountedProduct implements OrderItem{           //10

    private String price;
    private String quantity;
    private String discount;

    public DiscountedProduct(String price, String quantity, String discount){
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
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

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public double calculatePrice() {
        double p = Double.parseDouble(price);
        double q = Double.parseDouble(quantity);
        double d = Double.parseDouble(discount);

        return p * q * (1 - d);
    }
}
