package lesson28.I.WashingMachine;

public class AutomatWashingMachine implements Mode, SmartMode {

    @Override
    public void toWash() {
        System.out.println("can to wash");
    }

    @Override
    public void toRinse() {
        System.out.println("can to rinse");

    }

    @Override
    public void toCompression() {
        System.out.println("can to compression");
    }
}
