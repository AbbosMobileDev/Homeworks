package lesson11.task3;

public class Acer extends Computer{
    public Acer(String processesModel, int diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    public void showInfo() {
        System.out.println("Acer kompyuter protsessor modeli"+getProcessesModel());
        System.out.println("Acer kompyuter xotira hajmi"+getDiskSize());
    }
}
