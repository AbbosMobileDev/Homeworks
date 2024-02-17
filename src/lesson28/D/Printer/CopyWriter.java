package lesson28.D.Printer;

public class CopyWriter {
    private Printer printer;

    public CopyWriter(Printer printer) {
        this.printer = printer;
    }
    void printSomething(){
        printer.print("Welcome to programming life . Never stop to learn!");
    }
}
