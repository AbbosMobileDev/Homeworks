package lesson11.task1;

public  class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return 2*(getA()+getB());
    }

    @Override
    public double getArea() {
        return getA()*getB();
    }

    @Override
    public double getSideCount() {
        int count =4;
        return count;
    }
}
