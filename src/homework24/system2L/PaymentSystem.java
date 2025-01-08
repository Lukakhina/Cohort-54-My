package homework24.system2L;

public interface PaymentSystem {
    void transferMoney(double amount, PaymentSystem recipient);

    boolean withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();

    String getCurrency();
    String getTitle();
}

