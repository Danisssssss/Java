public class FuelGauge {
    private int fuel; // максимальное кол-во топлива = 50л

    // Конструктор
    public FuelGauge() {
        fuel = 0;
    }

    // не уверен, нужен ли этот конструктор
    public FuelGauge(int fuel) {
        if (fuel > 50) {
            System.out.println("Автомобиль может вместить максимум 50 литров");
            this.fuel = 50;
        } else {
            this.fuel = fuel;
        }
    }

    // Геттеры
    public int getFuel() {
        return fuel;
    }

    // Сеттеры
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // увеличение топлива на 1 литр
    public void increment() {
        if (fuel < 50) {
            ++fuel;
        } else {
            System.out.println("Бак полный!");
        }
    }

    // уменьшение топлива на 1 литр
    public void decrement() {
        if (fuel > 0) {
            --fuel;
        } else {
            System.out.println("Бак пустой!");
        }
    }

}
