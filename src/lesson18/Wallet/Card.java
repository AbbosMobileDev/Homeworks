package lesson18.Wallet;

public class Card {
    private final String userName;
    private final String cardNumber;
    private double amount;


    public void setAmount(double amount) {
        this.amount += amount;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getUserName() {
        return userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Card(String userName, int cardNumber, double amount) {
        this.userName = userName;
        this.cardNumber = String.valueOf(cardNumber);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "userName='" + userName + '\'' +
                ", cardNumber=" + cardNumber +
                ", amount=" + amount +
                '}';
    }
}
