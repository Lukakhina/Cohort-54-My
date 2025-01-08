package homework24.system1L;

public interface PaySystem {
    // withdraw - Снять, отзывать
    // amount - Сумма, количество
    // transfer - передача
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
}
