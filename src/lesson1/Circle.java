package ua.kiev.prog.lesson1;

/**
 * Created by yurge on 29.03.2016.
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare (){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle2 = new Circle(3);
        System.out.println(circle.getSquare());
        System.out.println(circle2.getSquare());
    }
}
