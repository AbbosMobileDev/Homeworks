package Lesson16.Abstraction1;

public class B extends Ballar {
    private int firstBall;
    private int secondBall;
    private int thirdBall;

    public B(int firstBall, int secondBall, int thirdBall) {
        this.firstBall = firstBall;
        this.secondBall = secondBall;
        this.thirdBall = thirdBall;
    }

    @Override
    public void getPersentage() {
        System.out.println("Biringchi fan :" + firstBall + " %");
        System.out.println("Ikkinchi fan :" + secondBall + " %");
        System.out.println("Uchinchi  fan :" + thirdBall + " %");

    }
}
