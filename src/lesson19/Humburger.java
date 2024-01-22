package lesson19;

public class Humburger {
    private String typeOfRulon;
    private String typeOfMeat;
    private double prise;
    private String differentFoods;

    @Override
    public String toString() {
        return "Humburger{" +
                "typeOfRulon='" + typeOfRulon + '\'' +
                ", typeOfMeat='" + typeOfMeat + '\'' +
                ", prise=" + prise +
                ", differentFoods='" + differentFoods + '\'' +
                '}';
    }

    public String getDifferentFoods() {
        return differentFoods;
    }

    public void setDifferentFoods(String differentFoods) {
        this.differentFoods = differentFoods;
    }

    public Humburger(String typeOfRulon, String typeOfMeat, double prise) {
        this.typeOfRulon = typeOfRulon;
        this.typeOfMeat = typeOfMeat;
        this.prise = prise;

    }




}
