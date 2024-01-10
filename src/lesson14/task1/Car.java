package lesson14.task1;

public class Car {
    private final int  numberOfCharger;
    private final int  powerOfMotor;
    private int counterBattery=0;
    private int counterPower=0;
    Battery battery= new Battery();
    public int getNumberOfCharger() {
        return numberOfCharger;
    }

    public int getPowerOfMotor() {
        return powerOfMotor;
    }

    public Car(int numberOfCharger, int powerOfMotor) {
        this.numberOfCharger = numberOfCharger;
        this.powerOfMotor = powerOfMotor;
    }
  public boolean addBattery(){
        boolean possible = true;
        if(counterBattery == numberOfCharger)
           possible = false;
        else{
            counterBattery++;
            this.counterPower+=battery.getSizeOfBattery();
            possible =true;
        }
        return possible;
        }
        public void getBatteryInfo(){
        float protsentBatery = this.counterPower * 100 /powerOfMotor;
            System.out.println("Zaryad foizi : "+ protsentBatery +"%");
        }
}

