public class Extractor extends Thread {
    private int ID;
    private int transactions;
    private int amount;
    private boolean running;

    Extractor(int id) {
        ID = id;
        amount = (int)(-0.5 * id * id + 4 * id + 2);
        running = true;
    }

    public int getID() {
        return ID;
    }

    public int getTransactions() {
        return transactions;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isRunning() {
        return running;
    }

    public void extractAmount(Bank bank) {
        if (bank.getMoney() < amount) {
            running = false;
            Main.stopPerforming();
            return;
        }
        bank.extractMoney(amount);
        transactions++;
    }

    public void run() {
        while (running) {
            try {
                Thread.sleep(50);
                extractAmount(Main.bank);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
