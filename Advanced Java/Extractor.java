public class Extractor extends Thread {
    private int amount;
    private int transactions;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void extractAmount(Bank bank) {
        if (bank.getMoney() < amount) {
            Main.stopOperations();
            return;
        }
        bank.extractMoney(amount);
    }

    public void run() {
        synchronized (Main.bank) {
            extractAmount(Main.bank);
            transactions++;
        }
    }
}
