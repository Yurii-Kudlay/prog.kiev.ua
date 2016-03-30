package lesson2.shapes;


public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3,9);
        System.out.println("Rectangle square is: " + rectangle.getSquare());

        System.out.println("-------------------------------------");

        Triangle triangle = new Triangle(11,11);
        System.out.println("Triangle square is: " + triangle.getSquare());

        System.out.println("-------------------------------------");

        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println("Circle square is: " + circle.getSquare());
    }
}
