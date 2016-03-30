package lesson4.shapes;

/**
 * Created by yurge on 18.02.2016.
 */
public class Rectangle extends Shape {

    private double width;
    private double heigth;


    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    @Override
    public double getS() {
        return width * heigth;
    }

    @Override
    public String toString() {
        return "Rectangle: ";
    }
}
