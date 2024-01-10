package lesson14.task1;

public class mainCar {
    public static void main(String[] args) {
        Battery battery  = new Battery(100);
        Car car = new Car(5 ,500);
        System.out.println(car.addBattery());     System.out.println(car.addBattery());     System.out.println(car.addBattery());
        car.getBatteryInfo();
    }

}
