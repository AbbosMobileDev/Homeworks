package lesson28.I.Telephone;

public class Nokia implements Function {
    @Override
    public void toCall() {
        System.out.println("nokia can to call");
    }

    @Override
    public void toSendSMS() {
        System.out.println("nokia can to send SmS");
    }
}

