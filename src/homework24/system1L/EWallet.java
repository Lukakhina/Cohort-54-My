package homework24.system1L;

public class EWallet implements PaySystem {
    private String title;
    private double balance;

    public EWallet(String title, double aDouble) {
        this.title = title;
        this.balance = aDouble;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "EWallet{" +
                "title='" + title + '\'' +
                ", aDouble=" + balance +
                '}';
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println(" Недостаточно денег на счету для снятия " + amount);
            return;
        }
        System.out.printf("E-Wallet %s. Вывод средств со счета: %.2f\n", title, amount);
        balance -= amount;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.printf("E-Wallet %s. Зачисление средств со счета: %.2f\n", title, amount);
        balance += amount;

    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
