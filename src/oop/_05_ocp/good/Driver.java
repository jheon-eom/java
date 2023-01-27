package oop._05_ocp.good;

public class Driver {

    private final Car car;

    public Driver(Car car) {
        this.car = car;
    }

    void drive() {
        car.run();
        car.stop();
    }

}
