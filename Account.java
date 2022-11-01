public class Account {
    private float balance;
    private float lastTransaction;
    public float showBalance() {
        return this.balance;
    }

    public float withdraw (float amount) throws Exception {
        if (this.balance - amount < 0.0) {
            throw new Exception("your amount is higher than what you want");
        }
        this.balance = this.balance - amount;
        this.lastTransaction = amount;
        return this.balance;
    }

    public float deposit (float amount) {
        this.balance = this.balance + amount;
        this.lastTransaction = amount;
        return this.balance;
    }

    public float getLatsTransaction() {
        return lastTransaction;
    }

}
