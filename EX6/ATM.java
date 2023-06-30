public class ATM {
    private int atmTotalMoney;

    public ATM(int atmTotalMoney) {
        this.atmTotalMoney = atmTotalMoney;
    }

    public ATM() {
        this.atmTotalMoney = 0;
    }

    public int getAtmTotalMoney() {
        return atmTotalMoney;
    }

    public void setAtmTotalMoney(int atmTotalMoney) {
        this.atmTotalMoney = atmTotalMoney;
    }

}
