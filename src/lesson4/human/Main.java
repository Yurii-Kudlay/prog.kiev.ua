package lesson4.human;

import java.util.Arrays;

/**
 * Created by yurge on 17.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        Human[] list = {new Human(21),new Human(13),new Human(1), new Human(34), new Human(11), };

        Arrays.sort(list);

        for (Human human : list){
            System.out.println(human.getAge());
        }
    }
}

