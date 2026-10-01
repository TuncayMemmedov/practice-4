package Shapesistemi;

public class Circle implements Shape{          //9

    private int radius;

    public Circle(double radius){
        this.radius = (int) radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }

}
