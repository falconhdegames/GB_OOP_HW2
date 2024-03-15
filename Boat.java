package HW_2;

public class Boat extends Vehicle implements Swimmable {
    public int maxSpeed;
    public boolean isSailing;
    public boolean isEngineStarted;
    public int speed;

    public Boat(int id, String brand, String model, int year) {
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
            System.out.println("Остановка лодки...");
        }
    }

    @Override
    public void startSwimming() {
        if (isEngineStarted) {
            System.out.println("Запуск лодки...");
            this.isSailing = true;
        }
    }

    @Override
    public void stopSwimming() {
        if (isSailing) {
            System.out.println("Остановка лодки...");
            this.isSailing = false;
        }
    }

    @Override
    public void displayInfo() {
        System.out.printf("Идентификатор: %s\nМарка: %s\nМодель: %s\nГод выпуска: %s\n", this.id, this.brand, this.model, this.year);
    }
}
