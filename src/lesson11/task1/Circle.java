package lesson11.task1;

import javax.print.SimpleDoc;

public  class Circle extends Shape{
    public Circle(double a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*getA() ;
    }

    @Override
    public double getArea() {
        return Math.PI*getA()*getA();
    }

    @Override
    public double getSideCount() {
        return 0;
    }
}
