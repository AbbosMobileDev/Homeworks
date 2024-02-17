package lesson28.D.Printer;

public class RgbPrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println("This message printed with RGB color :" + message);
    }
}
