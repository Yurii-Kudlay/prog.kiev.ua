package lesson4.shapes;

/**
 * Created by yurge on 18.02.2016.
 */
public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getS() {
        return 0.5 * height * base;
    }

    @Override
    public String toString() {
        return "Triangle: ";
    }
}
