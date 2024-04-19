package com.syntaxadda.lsp;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // Using a Car
        Car car = new Car();
        driver.drive(car);

        // Using an ElectricCar (LSP: ElectricCar is substitutable for Car)
        ElectricCar electricCar = new ElectricCar();
        driver.drive(electricCar);

        // Using a RaceCar (LSP: RaceCar is substitutable for Car)
        RaceCar raceCar = new RaceCar();
        driver.drive(raceCar);
    }
}

