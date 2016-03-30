package lesson2.shapes;


public class Triangle extends Shape {

    private  double heigth;
    private  double base;

    public Triangle(double heigth, double base) {
        this.heigth = heigth;
        this.base = base;
    }

    @Override
    public double getSquare() {
        return 0.5 * heigth * base;
    }
}
