package lesson14.task1.task2;

public class Car {
    int a;

    private Car(int a) {
        this.a = a;
    }
    public  Car get(int a){
        return new Car(a);
    }
}
