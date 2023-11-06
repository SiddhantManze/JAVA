import java.util.*;

interface Vehicle {
    void tire();

    void acceleration();

    void speed();
}

class Bicycle implements Vehicle {
    public void tire() {
        System.out.println("\nBicycle has narrow and lightweight tires.");
    }

    public void acceleration() {
        System.out.println("Bicycle's acceleration depends on pedaling and gear.");
    }

    public void speed() {
        System.out.println("Bicycle's speed depends on pedaling.");
    }
}

class Car implements Vehicle {
    public void tire() {
        System.out.println("\nCar are wide and supports vehicles.");
    }

    public void acceleration() {
        System.out.println("Car's acceleration is achieved through engine's power.");
    }

    public void speed() {
        System.out.println("Car's speed depends on acceleration.");
    }
}

class Bike implements Vehicle {
    public void tire() {
        System.out.println("\nBike has broad tires which varies for different bike.");
    }

    public void acceleration() {
        System.out.println("Bike invloves control of engine power of speed.");
    }

    public void speed() {
        System.out.println("Bike's speed is influenced by throttle control.\n");
    }
}

public class EXP8_Bicycle_Car_Bike { // Change to VehicleMain
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        Bike bike = new Bike();
        bicycle.tire();
        bicycle.acceleration();
        bicycle.speed();
        car.tire();
        car.acceleration();
        car.speed();
        bike.tire();
        bike.acceleration();
        bike.speed();
    }
}
