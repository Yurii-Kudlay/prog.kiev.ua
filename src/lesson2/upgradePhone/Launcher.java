package lesson2.upgradePhone;

/**
 * Created by yurge on 30.03.2016.
 */
public class Launcher {

    public static void main(String[] args) {
        Nokia3310 nokia = new Nokia3310();
        nokia.setPhoneNumber("0634588952");
        Phone.addPhone(nokia);

        IPhone iphone = new IPhone();
        iphone.setPhoneNumber("0674522318");
        Phone.addPhone(iphone);

        IPhone5 iphone5 = new IPhone5();
        iphone5.setPhoneNumber("0664513782");
        Phone.addPhone(iphone5);

        SamsungS4 samsungS4 = new SamsungS4();
        samsungS4.setPhoneNumber("0978522314");
        Phone.addPhone(samsungS4);

        //--------------------------------------
        nokia.call("0664513782");
        nokia.sendSMS("0664513782", "Hello!");

        iphone.sendSMS("0978522314", "Hi!");
        iphone.sendSMS("0634588952", "Hi! What`s up?");

        iphone5.call("0354211582");
        iphone5.call("0664513782");
        iphone5.sendSMS("0634588952", "Hi! What`s up?");

        samsungS4.call("0664513782");
        samsungS4.sendSMS("0664513782", "Hello, bro!");
        samsungS4.sendSMS("0634588952", "Ha-ha-ha...");

        Phone.showList();
    }
}
