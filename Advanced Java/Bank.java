public class Bank {
    private int money;
    private int criticalAmount;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void extractMoney(int money) {
        this.money -= money;
    }

    public int getCriticalAmount() {
        return criticalAmount;
    }

    public void updateCriticalAmount(int amount) {
        criticalAmount += amount;
    }
}
