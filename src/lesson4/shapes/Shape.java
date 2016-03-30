package lesson4.shapes;

/**
 * Created by yurge on 18.02.2016.
 */
abstract class Shape implements Comparable {

    public abstract double getS();

    @Override
    public int compareTo(Object obj) {
        Shape shape = (Shape) obj;

        if (getS() < shape.getS()) {
            return -1;
        } else if (getS() == shape.getS()) {
            return 0;
        } else if (getS() > shape.getS()) {
            return 1;
        } else {
            return 0;
        }
    }
}
