package lesson2.upgradePhone;

/**
 * Created by yurge on 30.03.2016.
 */
public class SamsungS4 extends  Phone{

    public SamsungS4() {
        touch = true;
        hasWifi = true;
        screenSize = 5;
        model = "Samsung S4";
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(model + " is sending sms: \"" + message + " Hello!\" to " + number);
        smsCounter++;
    }
}
