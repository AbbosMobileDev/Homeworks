package lesson11.task3;

public class HP extends Computer{
    public HP(String processesModel, int diskSize) {
        super(processesModel, diskSize);

    }
    @Override
    public void showInfo() {
        System.out.println("HP kompyuter protsessor modeli"+getProcessesModel());
        System.out.println("HP kompyuter xotira hajmi"+getDiskSize());
    }
}
