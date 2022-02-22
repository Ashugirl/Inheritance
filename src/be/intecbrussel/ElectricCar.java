package be.intecbrussel;

public class ElectricCar extends Car{

    private String battery;

    @Override
    public void accelerate() {
        System.out.println("Electrical car is accelerating...");;

    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
