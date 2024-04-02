public class ParkedCar {
    private String brand;       // марка
    private String model;       // модель
    private String color;       // цвет
    private String number;      // номерной знак
    private int parkedMinutes; // кол-во минут, в течение которых
    // автомобиль был припаркован

    // Конструктор
    public ParkedCar(String brand, String model, String color, String number, int minutes) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.number = number;
        this.parkedMinutes = minutes;
    }

    // Геттеры
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public int getParkedMinutes() {
        return parkedMinutes;
    }

    // Сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setParckedMinutes(int parckedMinutes) {
        this.parkedMinutes = parckedMinutes;
    }

    public String toString() {
        return "Brand: " + brand + ";\nModel: " + model + ";\nColor: " + color + ";\nNumber: " + number + ";\nParked minutes: " + parkedMinutes + ";\n";
    }
}
