package lesson4.shapes;

import java.util.Arrays;

/**
 * Created by yurge on 18.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        Shape[] list = {new Rectangle(20,10.5),new Circle(6),new Rectangle(2,2),
                new Triangle(3,4), new Circle(11), new Triangle(14,17) };

        Arrays.sort(list);

        for (Shape shape : list){
            System.out.println(shape.toString() + shape.getS());
        }
    }
}
