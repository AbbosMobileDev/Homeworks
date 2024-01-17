package Lesson16.Fruit;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(100);
        Apple apple = new Apple("Olma","Yashil",10);
        Peach peach  = new Peach("Nok", "Oq", 24);
        Pomegranate pomegranate = new Pomegranate("Mevada", "qizil", 30);
        basket.addFruit(apple);
        basket.addFruit(peach);
        basket.addFruit(peach);
        basket.showBasketInfo();
    }
}
