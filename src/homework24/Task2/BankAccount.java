package homework24.Task2;

public class BankAccount implements PaymentSystem{
    private double account;
    private String valuta;

    public BankAccount(double account, String valuta) {
        this.account = account;
        this.valuta = valuta;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= account) {
            account -= amount;
            System.out.println("Withdrew " + amount + " " + valuta);
        } else {
            System.out.println("Insufficient funds.");
        }

    }

    @Override
    public void depositTransfer(double amount) {
        if (amount >= account) {
            account += amount;
            System.out.println("Deposit " + amount + " " + valuta);
        }


    }

    @Override
    public double checkBalance() {
        System.out.println("total on account " + account + valuta);
        return 0;
    }
}
