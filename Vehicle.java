package HW_2;

public abstract class Vehicle {
    public int id;
    public String brand;
    public String model;
    public int year;

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate(int speed);
    public abstract void brake();
    public abstract void displayInfo();
}
