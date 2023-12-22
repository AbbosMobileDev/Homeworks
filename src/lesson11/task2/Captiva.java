package lesson11.task2;

public class Captiva extends Car{
    @Override
    public int maxLongestWay() {
        return getBusyCopasity()*15;
    }

    @Override
    public int getMaxOilFromRedill() {
        return getMaxCopasity()-getBusyCopasity();
    }

    public Captiva(int maxCopasity, int busyCopasity) {
        super(maxCopasity, busyCopasity);
        }
}
