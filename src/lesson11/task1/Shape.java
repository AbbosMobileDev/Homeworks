package lesson11.task1;

public abstract class Shape {
  private double a , b ;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Shape(double a) {
        this.a = a;
    }
    public abstract double getPerimetr();
    public abstract double getArea();
    public abstract double getSideCount();


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

}
