public class Account {
    private String accountEmail;
    private String accountNumber;
    private String accountPassword;
    private int balance;
    private int moneySavings;

    public Account(String accountEmail, String accountNumber, String accountPassword) {
        this.accountEmail = accountEmail;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.balance = 0;
        this.moneySavings = 0;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMoneySavings() {
        return moneySavings;
    }

    public void setMoneySavings(int moneySavings) {
        this.moneySavings = moneySavings;
    }

   

}
