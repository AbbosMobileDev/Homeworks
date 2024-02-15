package lesson28.L.Car;

public class Isuzi extends TruckCar{
    @Override
    public void drive() {
        System.out.println("Can drive Isuzi");
    }

    @Override
    public void heavyLoad() {
        System.out.println("Can load heavy to Isuzi");
    }
}
