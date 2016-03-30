package lesson4.monitor;

/**
 * Created by yurge on 19.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        String [] list = {"e:\\1234.pls","e:\\downLoads\\java-m2.pdf","e:\\muzlo\\Po_doroge_na_morya.mp3"};
        Monitor monitor = new Monitor(list, new FileEvent());
        monitor.start();
    }
}
