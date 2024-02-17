package lesson28.D.Printer;

public class GeneralPrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println("This message printed with black color :" + message );
    }
}
