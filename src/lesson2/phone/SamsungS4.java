package lesson2.phone;

/**
 * Created by yurge on 30.03.2016.
 */
public class SamsungS4 extends Phone {

    public SamsungS4() {
        System.out.println("SamsungS4 constractor");
        hasWifi = true;
        screenSize = 5;
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SamsungS4 class is sending sms " + number + message + " hello!!!");
    }
}
