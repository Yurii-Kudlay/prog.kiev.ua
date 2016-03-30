package lesson1;

/**
 * Created by yurge on 29.03.2016.
 */
public class Test {

    public static int count;

    public Test() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println(Test.count);

        int n = 10;
        while (n-- > 0){
            new Test();
        }
        System.out.println(Test.count);
    }
}
