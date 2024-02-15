package lesson28.L.Car;

public class Main {
    public static void main(String[] args) {
        Monza monza = new Monza();
        monza.drif();
        monza.drive();

        Isuzi isuzi = new Isuzi();
        isuzi.drive();
        isuzi.heavyLoad();
    }
}
