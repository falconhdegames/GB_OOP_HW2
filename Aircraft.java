package HW_2;

public class Aircraft extends Vehicle implements Flyable {
    public int maxAttiude;
    public boolean isFlying;
    public int speed;
    public boolean isEngineStarted;

    public Aircraft(int id, String brand, String model, int year) {
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
            System.out.println("Прекращение полёта...");
        }
    }

    @Override
    public void takeOff() {
        if (isEngineStarted) {
            System.out.println("Взлёт...");
            this.isFlying = true;
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            System.out.println("Посадка...");
            this.isFlying = false;
        }
    }

    @Override
    public void displayInfo() {
        System.out.printf("Идентификатор: %s\nМарка: %s\nМодель: %s\nГод выпуска: %s\n", this.id, this.brand, this.model, this.year);
    }

}
