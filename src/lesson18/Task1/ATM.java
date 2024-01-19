package lesson18.Task1;

import java.util.ArrayList;

public class ATM {
    
    private ArrayList<Money> moneyArrayList = new ArrayList<>();
    private ShowMoneyInterface showMoneyInterface = null;
    private MessageInterface messageInterface = null;
    private double moneyAmount;

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount += moneyAmount;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    private boolean hasMessageListener() {
        return messageInterface != null;
    }




    private boolean hasShowMoneyListener() {
        return showMoneyInterface != null;
    }

    private void setMessageListener(MessageInterface messageInterface) {
        if (!hasMessageListener()) {
            this.messageInterface = messageInterface;
        }
    }

    private void setShowMoneyListener(ShowMoneyInterface showMoneyInterface) {
        if (!hasShowMoneyListener()) {
            this.showMoneyInterface = showMoneyInterface;
        }
    }

}




