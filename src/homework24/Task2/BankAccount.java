package homework24.Task2;

public class BankAccount implements PaymentSystem{
    private double account;
    private String valuta;

    public BankAccount(double account, String valuta) {
        this.account = account;
        this.valuta = valuta;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account=" + account +
                ", valuta='" + valuta + '\'' +
                '}';
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
        return account;
    }
}
