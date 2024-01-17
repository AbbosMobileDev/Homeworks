package Lesson16.Abstraction1;

public class A extends Ballar{

    private int firstBall;
    private int secondBall;
    private int thirdBall;
    private int fourthBall;

    public A(int firstBall, int secondBall, int thirdBall, int fourthBall) {
        this.firstBall = firstBall;
        this.secondBall = secondBall;
        this.thirdBall = thirdBall;
        this.fourthBall = fourthBall;
    }

    @Override
    public void getPersentage() {
        System.out.println("Biringchi fan :" + firstBall + " %");
        System.out.println("Ikkinchi fan :" + secondBall + " %");
        System.out.println("Uchinchi  fan :" + thirdBall + " %");
        System.out.println("To'rtinchi  fan :" + fourthBall + " %");

    }
}
