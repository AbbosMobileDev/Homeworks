package lesson11.task3;

public class MSI extends Computer{
    public MSI(String processesModel, int diskSize) {
        super(processesModel, diskSize);
    }
    @Override
    public void showInfo() {
        System.out.println("MSI kompyuter protsessor modeli"+getProcessesModel());
        System.out.println("MSI kompyuter xotira hajmi"+getDiskSize());
    }
}
