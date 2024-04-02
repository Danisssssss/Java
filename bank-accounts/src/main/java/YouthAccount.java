class YouthAccount extends Account {
    private double cashbackRate; // Кэшбек

    public YouthAccount(AccountOwner owner, double balance) {
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
        if (transactions.isEmpty()) {
            balance -= 300.0; // Штраф за отсутствие операций оплаты в течение месяца
            transactions.put(transactions.size() + 1, new Transaction("Штраф", -300.0));
        }
        for (Transaction transaction : transactions.values()) {
            if (transaction.getAmount() < 0) { // Обработка только операций оплаты (отрицательные суммы)
                double cashback = transaction.getAmount() * cashbackRate;
                balance += cashback; // Зачисление кэшбека
                transactions.put(transactions.size() + 1, new Transaction("Кэшбэк", cashback));
            }
        }
    }
}
