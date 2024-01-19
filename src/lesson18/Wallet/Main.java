package lesson18.Wallet;

import lesson14.task1.task2.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Abbos", 6661, 155555);
        Card card2 = new Card("Abbos", 7548, 1165656);
        Card card3 = new Card("Abbos", 2158, 100000);
        Card card4 = new Card("Abbos", 4861, 20000);
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("Abbos", 2321, 65000));
        cards.add(new Card("Abbos", 1555, 10000));

        Wallet wallet = new Wallet();
        wallet.setLogListener(new LogInterface() {
            @Override
            public void sendMessage(String message) {
                System.out.println(message);
            }

        });
wallet.setShowCardInterfacxe(new ShowCardInterface() {
    @Override
    public void showCardData(Card card) {
        System.out.println("\n");
    }
});
 wallet.addCard(card1,false);


    }
}



