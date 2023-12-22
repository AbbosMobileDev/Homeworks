package lesson11.task3;

public abstract class Computer {
    private String processesModel;
    private int diskSize;
    public abstract void showInfo();

    public String getProcessesModel() {
        return processesModel;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public Computer(String processesModel, int diskSize) {
        this.processesModel = processesModel;
        this.diskSize = diskSize;
    }
}
