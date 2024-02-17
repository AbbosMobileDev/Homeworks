package lesson28.I.ManLife.BardakCondition;

public class Man implements Move{
    @Override
    public void toSleep() {
        System.out.println("man do sleep");
    }

    @Override
    public void toDrink() {
        System.out.println("man do drink");

    }

    @Override
    public void toEat() {
        System.out.println("man do eat");

    }

    @Override
    public void toDriveCar() {
        throw new RuntimeException("You cannot drive");
    }

    @Override
    public void toEarnMoney() {
        System.out.println("man do earn money");

    }
}
