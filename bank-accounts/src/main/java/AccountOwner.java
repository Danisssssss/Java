// Класс для хранения информации о владельце счета
class AccountOwner {
    private String user;    // ФИО владельца счета
    private int pincode;    // пин-код

    // Конструктор (открытие счета)
    public AccountOwner(String user, int pin) {
        this.user = user;
        this.pincode = pin;
    }

    // Геттеры
    public String getUser() {
        return user;
    }

    public int getPincode() {
        return pincode;
    }
}
