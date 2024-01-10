package lesson13;

import lesson13.BankCards;

import java.util.Scanner;

public class mainBANK {
    public static void main(String[] args) {
        BankCards[] cardType = BankCards.values();
        for(int i = 0; i<= cardType.length;)
            System.out.println(cardType[i]);
        System.out.println("Siz shu kartalardan birini tanlashingiz mumking !");
        System.out.print("Iltimos bank kartasi nomini kiririting: ");
        Scanner scanner= new Scanner(System.in);
        String nameOfCard = scanner.next();

    }

}
