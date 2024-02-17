package lesson28.D.Cutter;

public class CutterMachine {
    private Cutter cutter;

    public CutterMachine(Cutter cutter) {
        this.cutter = cutter;
    }
    public void cutSomething(){
        cutter.cut();
    }
}
