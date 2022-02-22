package be.intecbrussel;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("White");
        car.accelerate();
        car.turnLeft();
        car.turnRight();
        car.slowDown();

        Convertible convertible = new Convertible();
        convertible.setColor("Black");
        convertible.accelerate();
        convertible.turnLeft();
        convertible.turnRight();
        convertible.slowDown();
        convertible.switchToNoRoof();

        ElectricCar electricCar = new ElectricCar();
        electricCar.setColor("Red");

        electricCar.accelerate();
        electricCar.turnLeft();
        electricCar.turnRight();
        electricCar.slowDown();
    }
}
