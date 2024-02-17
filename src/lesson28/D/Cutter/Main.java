package lesson28.D.Cutter;

public class Main {
    public static void main(String[] args) {
        Cutter cutter1= new KnifeCutter();
        CutterMachine cutterMachine = new CutterMachine(cutter1);
        cutterMachine.cutSomething();
        Cutter cutter2= new ScissorsCutter();
        CutterMachine cutterMachine2 = new CutterMachine(cutter2);
        cutterMachine2.cutSomething();
    }
}
