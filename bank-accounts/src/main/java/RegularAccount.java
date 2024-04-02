class RegularAccount extends Account {
    private double serviceCharge; // обслуживание счета

    // Конструктор (открытие счета)
    public RegularAccount(AccountOwner owner, double balance) {
        super(owner, balance);
        this.serviceCharge = 100.0;     // Минимальная плата за обслуживание счета
        this.minimumBalance = 5000.0;   // Минимальный баланс
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
        if (balance < minimumBalance) {
            balance -= 100.0; // Штраф за падение баланса ниже минимального
            transactions.put(transactions.size() + 1, new Transaction("Штраф", -100.0));
        }
        balance -= serviceCharge; // Ежемесячная плата за обслуживание счета
        transactions.put(transactions.size() + 1, new Transaction("Обслуживание счета", -serviceCharge));
    }


}
