package lesson28.D.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new GeneralPrinter();
        CopyWriter copyWriter1 = new CopyWriter(printer);
        copyWriter1.printSomething();
    }
}
