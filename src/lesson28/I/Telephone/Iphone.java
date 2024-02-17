package lesson28.I.Telephone;

public class Iphone implements Function, SmartFuncktion,SpecialFunction{

    @Override
    public void toCall() {
        System.out.println("iphone can to call");
    }

    @Override
    public void toSendSMS() {
        System.out.println("iphone can to send sms");

    }

    @Override
    public void toSharePhoto() {
        System.out.println("iphone can to share photo");

    }

    @Override
    public void toConnectWifi() {
        System.out.println("iphone can to connect wi-fi");

    }

    @Override
    public void NighMode() {
        System.out.println("iphone can to on nightmode");

    }

    @Override
    public void economBatery() {
        System.out.println("iphone can to on econom battery mode");

    }
}
