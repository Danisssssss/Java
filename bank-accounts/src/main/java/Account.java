import java.util.HashMap;

// Базовый класс для всех типов счетов
abstract class Account {
    protected AccountOwner owner; // владелец (ФИО, пинкод)
    protected double balance;     // баланс
    protected int amountOfMonths; // количество месяцев с открытия счета
    protected HashMap<Integer, Transaction> transactions; // транзакции
    protected double minimumBalance; // минимальный баланс

    // Конструктор (открытие счета)
    public Account(AccountOwner owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.amountOfMonths = 0;
        this.transactions = new HashMap<>();
    }

    // Геттеры
    public AccountOwner getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getAmountOfMonths() {
        return amountOfMonths;
    }

    public void incrementMonthsSinceOpening() {
        amountOfMonths++;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.put(transactions.size() + 1, new Transaction("Депозит", amount));
    }

    // снятие денег
    public abstract void withdraw(double amount, int pin);

    // Метод для подсчета комиссий и штрафов
    public abstract void calculateFeesAndPenalties();

    public void getAccountDetails() {
        System.out.println("Владелец: " + owner.getUser());
        System.out.println("Баланс: " + balance);
        System.out.println("Количество месяцев с открытия счета: " + amountOfMonths);
        System.out.println("Транзакции:");
        for (Transaction transaction : transactions.values()) {
            System.out.println(transaction.getDescription() + ": " + transaction.getAmount());
        }
    }

}
