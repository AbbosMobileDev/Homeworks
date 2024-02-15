package lesson28.L.Animals;

public class Elephant implements HerbivoreAnimals{
    @Override
    public String run() {
        return "can to run Elephant";
    }

    @Override
    public String eatPlant() {
        return "Can to eat plant Elephant";
    }
}
