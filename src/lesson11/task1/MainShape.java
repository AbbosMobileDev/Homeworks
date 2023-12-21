package lesson11.task1;

public class MainShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5) ;
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getSideCount());
        Circle circle = new Circle(4);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSideCount());

    }


}
