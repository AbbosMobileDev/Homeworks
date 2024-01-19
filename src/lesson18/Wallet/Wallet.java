package lesson18.Wallet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Wallet {
    private LogInterface logInterface = null;
    private ShowCardInterface showCardInterface = null;
    private List<Card> cards = new LinkedList<>();
    private double moneyAmount;

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount += moneyAmount;
    }

    public double getMoneyAmount() {

        return moneyAmount;
    }

    private boolean hasLogListener() {
        return logInterface != null;

    }

    private boolean hasShowCardListener() {
        return showCardInterface != null;
    }

    public void setLogListener(LogInterface logInterface) {
        if (!hasLogListener()) {
            this.logInterface = logInterface;
        }
    }

    public void setShowCardInterfacxe(ShowCardInterface showCardInterface) {
        if (!hasShowCardListener()) {
            this.showCardInterface = showCardInterface;
        }
    }


    public void addCard(Card card, boolean isList) {
        if (cards.contains(card)) {
            cards.add(card);
            logInterface.sendMessage("Yangi karta qo'shildi !");

        } else {
            if (isList) {
                showCardInterface.showCardData(card);
            } else {
                logInterface.sendMessage("Xato : bu karta oldin qo'shilgan !");
            }
        }

    }

    public void addBalance(double moneyAmount) {
        setMoneyAmount(moneyAmount);

    }

    public void addCard(List<Card> cards) {
        cards.forEach(card -> addCard(card, true));

    }

    public double getTotalBalance() {
        double summer = 0.0;
        for (Card card : cards) {
            summer += card.getAmount();
        }
        summer += moneyAmount;
        return summer;
    }

    public void getAllCrds() {
        cards.forEach(card -> showCardInterface.showCardData(card));
    }

    public void spendMoney(double money) {
        if (moneyAmount >= money) {
            moneyAmount -= money;
        } else {
            double s = money - moneyAmount;
            logInterface.sendMessage(s + " shuncha summa yetmadi");
        }
    }

    void spendMoney(Card card, int spendMoney) {
        if (cards.contains(card)) {
            if (card.getAmount() >= spendMoney) {
                card.setAmount(-1 * spendMoney);
                showCardInterface.showCardData(card);
            } else {
                double s = spendMoney - card.getAmount();
                logInterface.sendMessage(s + " bu kartada yetarli summa yo'q");
            }
        } else {
            logInterface.sendMessage("Xatolik : bu karta topilmadi");
        }
    }


}

