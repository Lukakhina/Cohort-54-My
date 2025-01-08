package homework24.system2L;



public abstract class VusaMember implements PaymentSystem {
    private final String currency;

    private double courseBTC;
    protected String title;
    protected double balance;

    public VusaMember(String title, double balance, String currency) {
        this.title = title;
        this.balance = balance;
        this.currency = currency;
        setActualBtcCourse(currency);
    }

    public void  setActualBtcCourse(String currency) {
        // запрос на сервер платежной системы
        // получение актуального курса и присвоение его в поле
        this.courseBTC = 100_000;

    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCourseBTC() {
        return courseBTC;
    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств для снятия " +   amount);
            return false;
        }

        balance -= amount;
        System.out.printf("Успешно снято со счета %.2f %s. (Банк %s)\n",
                amount, this.getCurrency(), title
        );
        return true;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.println(title + " зачисляю на счет: " + amount +
                this.getCurrency());
        balance += amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}