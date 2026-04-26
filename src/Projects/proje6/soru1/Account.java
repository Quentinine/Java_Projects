package Projects.proje6.soru1;

public class Account {
    private int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;

    public Account(int accountId, int customerId, AccountType accountType) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void depositToAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Başarıyla yatırıldı. Güncel bakiyeniz: " + balance + " TL");
        } else {
            System.out.println("Hata: Yatırılacak tutar 0'dan büyük olmalıdır.");
        }
    }

    public void withdrawToAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Hata: Çekilecek tutar 0'dan büyük olmalıdır.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Başarıyla çekildi. Güncel bakiyeniz: " + balance + " TL");
        } else {
            System.out.println("Hata: Bakiyeniz yetersiz! Mevcut bakiye: " + balance + " TL");
        }
    }

    @Override
    public String toString() {
        return "Hesap [ID=" + accountId + ", Tür=" + accountType + ", Bakiye=" + balance + "]";
    }
}