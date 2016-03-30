package lesson4.shapes;

/**
 * Created by yurge on 18.02.2016.
 */
public class Circle extends Shape  {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getS() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: ";
    }
}
