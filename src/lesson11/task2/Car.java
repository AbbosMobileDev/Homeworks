package lesson11.task2;

public abstract class Car {
    private int maxCopasity;
    private int busyCopasity;

    public abstract int maxLongestWay();
    public abstract int getMaxOilFromRedill();

    public Car(int maxCopasity, int busyCopasity) {
        this.maxCopasity = maxCopasity;
        this.busyCopasity = busyCopasity;
    }

    public int getMaxCopasity() {
        return maxCopasity;
    }

    public int getBusyCopasity() {
        return busyCopasity;
    }
}
