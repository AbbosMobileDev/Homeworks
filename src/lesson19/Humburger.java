package lesson19;

public class Humburger extends Healty {
    private String typeOfRulon;
    private String typeOfMeat;
    private double prise;

    private  double priceHumburger=prise;

Healty healty;

    @Override
    public String toString() {
        return "Humburger{" +
                "typeOfRulon='" + typeOfRulon + '\'' +
                ", typeOfMeat='" + typeOfMeat + '\'' +
                ", prise=" + prise +
                ", priceHumburger=" + priceHumburger +
                '}';
    }

    public Humburger(String typeOfRulon, String typeOfMeat, double prise) {
        this.typeOfRulon = typeOfRulon;
        this.typeOfMeat = typeOfMeat;
        this.prise = prise;

    }




}
