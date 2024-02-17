package lesson28.I.ManLife.BardakCondition;

public class Child implements Move{
    @Override
    public void toSleep() {
        System.out.println("child do sleep");
    }

    @Override
    public void toDrink() {
        System.out.println("child do drink");

    }

    @Override
    public void toEat() {
        System.out.println("child do eat");

    }

    @Override
    public void toDriveCar() {
throw new RuntimeException("You cannot drive");
    }

    @Override
    public void toEarnMoney() {
        throw new RuntimeException("You cannot earn money");

    }
}
