package bankDetails;

import java.util.Date;

public class Transaction {
    private double transactionAmount;
    private TransactionType transactionType;
    private Account transactionAccount;
    private Date transactionDate;

    public Transaction(double amount, TransactionType type, Account account) {
        this.transactionAmount = amount;
        this.transactionType = type;
        this.transactionAccount = account;
    }

    public double getAmount() {
        return transactionAmount;
    }

    public TransactionType getType() {
        return transactionType;
    }

    public Account getAccount() {
        return transactionAccount;
    }

    public Date getDate() {
        return transactionDate;
    }
}
