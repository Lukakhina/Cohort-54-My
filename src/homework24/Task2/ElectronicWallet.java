package homework24.Task2;


public class ElectronicWallet implements PaymentSystem {
    private double account;
    private String valuta;

    public ElectronicWallet(double account, String valuta) {
        this.account = account;
        this.valuta = valuta;
    }

    @Override
    public void withdrawMoney(double amount) {

    }

    @Override
    public void depositTransfer(double amount) {

    }

    @Override
    public double checkBalance() {
        return 0;
    }
}