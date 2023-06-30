public class Transaction {
    public void userWithdraw(Account account, ATM atm, int money) {
        if (money > atm.getAtmTotalMoney()) {
            System.out.println("ATM Dont have enough money");
        } else {
            account.setBalance(account.getBalance() + money);
            atm.setAtmTotalMoney(atm.getAtmTotalMoney() - money);
        }
    }

    public void userSaving(Account account, int money) {
        if (money > account.getBalance()) {
            System.out.println("Account dont have enough money");
        } else {
            account.setBalance(account.getBalance() - money);
            account.setMoneySavings(account.getMoneySavings() + money);
        }
    }

    public int getUserBalance(Account account) {
        return account.getBalance();
    }
}
