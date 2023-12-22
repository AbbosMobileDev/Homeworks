package lesson11.task2;

public class CarMain {
    public static void main(String[] args) {
        Captiva captiva =new Captiva(30,10);
        System.out.println(captiva.getMaxOilFromRedill());
        System.out.println(captiva.getBusyCopasity());
        Malibu malibu = new Malibu(25,20);
        System.out.println(malibu.maxLongestWay());
        System.out.println(malibu.getMaxOilFromRedill());
    }
}
