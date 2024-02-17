package lesson28.I.Telephone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.economBatery();
        iphone.NighMode();
        iphone.toSendSMS();
        iphone.toSharePhoto();
        iphone.toConnectWifi();

        Nokia nokia = new Nokia();
        nokia.toCall();
        nokia.toSendSMS();
    }
}
