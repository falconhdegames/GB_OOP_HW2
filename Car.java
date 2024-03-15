package HW_2;

public class Car extends Vehicle {
    public int fuelCapacity;
    public int currentFuelLevel;
    public int speed;
    public boolean isEngineStarted;

    public Car(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя...");
        this.isEngineStarted = true;
    }

    @Override
    public void stopEngine() {
        if (!isEngineStarted) {
            System.out.println("Прекращение работы двигателя...");
            this.isEngineStarted = false;
        }
    }

    @Override
    public void accelerate(int speed) {
        if (!isEngineStarted) {
            System.out.println("Увеличение скорости на "+speed+"...");
            this.speed += speed;
            System.out.println("Текущая скорость: "+this.speed);
        }
    }

    @Override
    public void brake() {
        if (!isEngineStarted) {
            System.out.println("Прекращение движения...");
        }
    }

    public void refuel(int liters) {
        System.out.println("Заправка "+liters+"...");
        if (this.currentFuelLevel+liters <= this.fuelCapacity) {
            this.currentFuelLevel += liters;
        }
        else {
            this.currentFuelLevel = this.fuelCapacity;
        }
        System.out.println("Текущий уровень топлива: "+this.currentFuelLevel);
    }


    @Override
    public void displayInfo() {
        System.out.printf("Идентификатор: %s\nМарка: %s\nМодель: %s\nГод выпуска: %s\n", this.id, this.brand, this.model, this.year);
    }
}
