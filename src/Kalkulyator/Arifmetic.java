package Kalkulyator;

public class Arifmetic {
    private double a ;
    private  double b ;

    public Arifmetic(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double plus (){
        return a +b;
    }
    public double increase (){
        return a *b;
    }
    public  double minus(){
        return a-b;
    }
    public double decrease (){
        return a /b;
    }

}
