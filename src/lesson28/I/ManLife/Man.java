package lesson28.I.ManLife;

public class Man implements Move,HardMove,EasyMove{
    @Override
    public void toDrink() {
        System.out.println("Main can to drink");
    }

    @Override
    public void toEat() {
        System.out.println("Main can to eat");
    }

    @Override
    public void toSleep() {
        System.out.println("Main can to eat");

    }

    @Override
    public void toDriveCar() {
        System.out.println("Main can to drive");
    }

    @Override
    public void toEarnMoney() {
        System.out.println("Main can to earn");
    }
}
