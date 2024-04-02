public class main {
    public static void main(String[] args) {
        // Создаем владельцев счетов
        AccountOwner owner1 = new AccountOwner("Пользователь №1", 1234);
        AccountOwner owner2 = new AccountOwner("Пользователь №2", 5678);
        AccountOwner owner3 = new AccountOwner("Пользователь №3", 5678);

        // Создаем счета различных типов для владельцев
        RegularAccount regularAccount = new RegularAccount(owner1 , 10_000);
        AdvancedAccount advancedAccount = new AdvancedAccount(owner2 , 100_000);
        YouthAccount youthAccount = new YouthAccount(owner3 , 5_000);

        // Вывод детализированной информации о счетах
        regularAccount.getAccountDetails();
        System.out.println();
        advancedAccount.getAccountDetails();
        System.out.println();
        youthAccount.getAccountDetails();
        System.out.println();

        // Выполняем операции с каждым счетом
        regularAccount.withdraw(500.0, 1234); // Снятие наличных
        regularAccount.withdraw(1_000.0, 1234); // Снятие наличных
        advancedAccount.makePayment(1_000.0, "Онлайн магазин", 5678); // Оплата
        youthAccount.deposit(3_000.0); // Пополнение

        // Расчет комиссий и штрафов (завершение месяца)
        regularAccount.calculateFeesAndPenalties();
        advancedAccount.calculateFeesAndPenalties();
        youthAccount.calculateFeesAndPenalties();

        // Вывод детализированной информации о счетах
        regularAccount.getAccountDetails();
        System.out.println();
        advancedAccount.getAccountDetails();
        System.out.println();
        youthAccount.getAccountDetails();
        System.out.println();
    }
}
