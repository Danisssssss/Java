public class Odometer {
    private int mileage;

    // Конструктор
    public Odometer() {
        mileage = 0;
    }

    // не уверен, нужен ли этот конструктор
    public Odometer(int mileage) {
        if (mileage > 999_999) {
            this.mileage = mileage % 1_000_000; // если пробег больше 999 999км, то он сбрасывается до 0
        } else {
            this.mileage = mileage;
        }
    }

    // Геттеры
    public int getMileage() {
        return mileage;
    }

    // Сеттеры
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // увеличение пробега на 1 км
    public void increment() {
        if (mileage < 999_999) {
            mileage++;
        } else {
            mileage = 0;
        }
    }

    public void drive(FuelGauge fuelGauge) {
        mileage += 10;
        mileage %= 999_999;
        fuelGauge.decrement();
    }

}
