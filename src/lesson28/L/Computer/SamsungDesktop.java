package lesson28.L.Computer;

public class SamsungDesktop extends Desktop{
    @Override
    public void inputInfo() {
        System.out.println("Desktop can input info");
    }

    @Override
    public void readDisk() {
        System.out.println("Desktop can read DVD or CD disk");
    }
}
