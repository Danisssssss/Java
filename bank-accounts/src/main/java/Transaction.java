// Класс для хранения информации о транзакции
class Transaction {
    private final String description; // тип операции
    private final double amount;      // сумма

    // Конструктор
    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Геттеры
    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
