class AdvancedAccount extends Account {
    private double cashbackRate; // Кэшбек

    // Конструктор (открытие счета)
    public AdvancedAccount(AccountOwner owner, double balance) {
        super(owner, balance);
        this.cashbackRate = 0.01; // Кэшбек на операции оплаты
    }

    @Override
    public void withdraw(double amount, int pinCode) {
        if (pinCode != getOwner().getPincode()) {
            System.out.println("Неверный PIN-код. Снятие средств не удалось.");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("Недостаточно средств. Снятие средств не удалось.");
            return;
        }
        balance -= amount;
        transactions.put(transactions.size() + 1, new Transaction("Вывод средств", -amount));
    }

    @Override
    public void calculateFeesAndPenalties() {
        // Нет комиссий и штрафов для продвинутого счета
    }

    public void makePayment(double amount, String storeName, int pinCode) {
        if (pinCode != getOwner().getPincode()) {
            System.out.println("Неверный PIN-код. Снятие средств не удалось.");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("Недостаточно средств. Снятие средств не удалось.");
            return;
        }
        double cashback = Math.min(amount * cashbackRate, 100.0); // Не более 100 рублей кэшбека
        balance -= amount;
        balance += cashback; // Зачисление кэшбека
        transactions.put(transactions.size() + 1, new Transaction("Оплата: " + storeName, -amount));
        transactions.put(transactions.size() + 1, new Transaction("Кэшбэк", cashback));
    }

}
