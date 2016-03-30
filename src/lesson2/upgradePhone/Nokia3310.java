package lesson2.upgradePhone;

/**
 * Created by yurge on 30.03.2016.
 */
public class Nokia3310 extends Phone {

    public Nokia3310() {
        touch = false;
        hasWifi = false;
        screenSize = 2;
        model = "Nokia 3310";
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(model + " is sending sms: \"" + message + "\" to " + number);
        smsCounter++;
    }
}
