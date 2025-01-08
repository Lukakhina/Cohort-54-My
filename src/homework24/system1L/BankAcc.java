package homework24.system1L;

public class BankAcc implements PaySystem{
    // title - заголовок, название
    private String title;
    private double balance;

    public BankAcc(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }


    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println(" Недостаточно денег на счету для снятия " + amount);
            return;
        }
        System.out.printf("Банк %s. Вывод средств со счета: %.2f\n", title, amount);
        balance -= amount;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.printf("Банк %s. Зачисление средств со счета: %.2f\n", title, amount);
        balance += amount;

    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
