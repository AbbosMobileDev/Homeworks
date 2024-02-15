package lesson28.L.Animals;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.run());
        System.out.println(lion.eatMeat());

        Elephant elephant  = new Elephant();
        System.out.println(elephant.eatPlant());
        System.out.println(elephant.run());
    }
}
