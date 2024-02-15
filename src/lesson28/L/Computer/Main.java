package lesson28.L.Computer;

public class Main {
    public static void main(String[] args) {
        Macbook macbook = new Macbook();
        macbook.Bluetooth();
        macbook.inputInfo();

        SamsungDesktop samsungDesktop = new SamsungDesktop();
        samsungDesktop.inputInfo();
        samsungDesktop.readDisk();
    }
}
