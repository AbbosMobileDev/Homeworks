package lesson19;

public class KingBurgers implements Action{
    @Override
    public void sellBurger(Humburger humburger) {
        Action.super.sellBurger(humburger);
    }
}
