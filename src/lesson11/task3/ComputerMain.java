package lesson11.task3;

public class ComputerMain {
    public static void main(String[] args) {
        Acer acer = new Acer("Intel core i9",512);
        HP hp = new HP("Intel core i9",512);
        MSI msi = new MSI("Intel core i9",512);

        acer.showInfo();
        hp.showInfo();
        msi.showInfo();
    }


}
