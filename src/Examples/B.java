package Examples;

public class B implements A{
    @Override
    public void showName(String message) {
        A.super.showName(message);
        System.out.println(message);
    }
}
