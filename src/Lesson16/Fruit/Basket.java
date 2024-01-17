package Lesson16.Fruit;

import java.util.Arrays;

public class Basket {
    private double maxWeight;
    private double counterWeight;
    Fruit[] arrayBasket = new Fruit[]{};

    public Basket(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isEmpty() {
        return counterWeight == 0;
    }

    public boolean isFull() {
        return counterWeight == maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getCounterWeight() {
        return counterWeight;
    }

    public Fruit[] getArrayBasket() {
        return arrayBasket;
    }

    public boolean addFruit(Fruit fruit) {
        if (!isFull()) {
            Fruit[] newArray = new Fruit[arrayBasket.length + 1];
            int index = 0;
            for (Fruit value : arrayBasket) {
                newArray[index++] = value;
            }
            newArray[index] = fruit;
            arrayBasket = newArray;
            maxWeight = (byte) getMaxWeight()- fruit.getWeight();
            return true;
        }
        return false;

    }
    public void showBasketInfo(){
        System.out.println(Arrays.toString(arrayBasket));
    }
    public void getEmptySize(){
        System.out.println("Savatdagi bo'sh joy :"+ maxWeight);
    }

}



