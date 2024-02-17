package lesson28.I.ManLife;

public class Child implements Move, EasyMove {
    @Override
    public void toDrink() {
        System.out.println("Child can to drink");
    }

    @Override
    public void toEat() {
        System.out.println("child can to eat");
    }

    @Override
    public void toSleep() {
        System.out.println("child can to eat");

    }
}
