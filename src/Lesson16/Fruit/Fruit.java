package Lesson16.Fruit;

public abstract class Fruit {
    private String name;
    private String color;
    private double weight;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public final void showInfo(){


    }

    public double getWeight() {
        return weight;
    }
}
