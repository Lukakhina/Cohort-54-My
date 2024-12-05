package homework24.Task2;


public class ElectronicWallet implements PaymentSystem {
    private double account;
    private String valuta;

    public ElectronicWallet(double account, String valuta) {
        this.account = account;
        this.valuta = valuta;
    }
}