package HW_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(0, "SomeBrand", "SomeModel", 2024);
        Aircraft aircraft = new Aircraft(1, "SomeBrand 1", "SomeModel 1", 2010);
        Boat boat = new Boat(2, "BoatBrand", "BoatModel 123", 2018);

        car.startEngine();
        car.accelerate(10);
        car.stopEngine();
        car.displayInfo();

        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.accelerate(10);
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayInfo();

        boat.startEngine();
        boat.startSwimming();
        boat.accelerate(10);
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayInfo();
    }
}
