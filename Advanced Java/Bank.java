public class Bank {
    private int balance;

    public int getMoney() {
        return balance;
    }

    public void setMoney(int balance) {
        this.balance = balance;
    }

    public void extractMoney(int balance) {
        this.balance -= balance;
    }
}
