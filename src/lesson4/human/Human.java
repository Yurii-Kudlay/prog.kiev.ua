package lesson4.human;

/**
 * Created by yurge on 17.02.2016.
 */
public class Human implements Comparable {

    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object obj) {

        Human human = (Human) obj;

    
        if (age < human.age) {
            return 1;
        } else if (age == human.age) {
            return 0;
        } else if (age > human.age) {
            return -1;
        } else {
            return 0;
        }
    }
}


