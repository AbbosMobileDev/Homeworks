package lesson11.task2;

public class Malibu extends Car{
    public Malibu(int maxCopasity, int busyCopasity) {
        super(maxCopasity, busyCopasity);
    }

    @Override
    public int maxLongestWay() {
        return getBusyCopasity()*10;
    }

    @Override
    public int getMaxOilFromRedill() {
        return getMaxCopasity()-getBusyCopasity();
    }
}
