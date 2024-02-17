package lesson28.I.WashingMachine;

public class Main {
    public static void main(String[] args) {
        AutomatWashingMachine automatWashingMachine = new AutomatWashingMachine();
        automatWashingMachine.toCompression();
        automatWashingMachine.toWash();
        automatWashingMachine.toCompression();

        SimpleWashingMachine simpleWashingMachine = new SimpleWashingMachine();
        simpleWashingMachine.toWash();
    }
}
