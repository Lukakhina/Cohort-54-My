package homework24.system2L;

public class BankAccount extends VusaMember{

    public BankAccount(String title, double balance) {
        super(title, balance, "EUR");
    }

    @Override
    public String toString() {
        return "BankAccount: {" + "title=" + title
                + ", balance=" + balance
                + ", currency: " + this.getCurrency() +
                '}';
    }

    @Override
    public void transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > balance) {
            System.out.printf("Недостаточно средств: (transfer: %.2f | balance: %.2f)\n)",
                    amountEur, balance);
            return;
        }

        if (recipient.getCurrency().equals("EUR")) {
            // Перевод евро на евровый счет
            balance -= amountEur;
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод %.2f EUR (%s -> %s)\n",
                    amountEur, title, recipient.getTitle());
            return;
        } else if(recipient.getCurrency().equals("BTC")) {
            // Конвертировать EUR в BTC
            double amountBtc = amountEur / getCourseBTC();
            balance -= amountEur;
            recipient.depositTransfer(amountBtc);

            System.out.printf("Успех! Перевод %.2f EUR в %.7f BTC (%s -> %s)\n",
                    amountEur, amountBtc, title, recipient.getTitle());
            return;
        }

        System.out.println("Что-то пошло не так с валютой счета получателя");

    }

//    @Override
//    public boolean withdrawMoney(double amount) {
//        if (amount > balance) {
//            System.out.println("Недостаточно средств для снятия " +   amount);
//            return false;
//        }
//
//        balance -= amount;
//        System.out.printf("Успешно снято со счета %.2f %s. (Банк %s)\n",
//                amount, this.getCurrency(), title
//        );
//        return true;
//    }
//
//    @Override
//    public void depositTransfer(double amount) {
//        System.out.println(title + " зачисляю на счет: " + amount +
//                this.getCurrency());
//    }
//
//    @Override
//    public double checkBalance() {
//        return balance;
//    }
}
