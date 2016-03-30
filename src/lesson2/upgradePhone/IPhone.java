package lesson2.upgradePhone;

/**
 * Created by yurge on 30.03.2016.
 */
public class IPhone extends Phone {

    public IPhone() {
        touch = true;
        hasWifi = true;
        screenSize = 3;
        model = "IPhone";
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(model + " is sending sms: \"" + message + "\" to " + number);
        smsCounter++;
    }
}
