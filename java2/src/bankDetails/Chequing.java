package bankDetails;

public class Chequing extends Account {

    private double debitLimit;
    private int numTransactions;
    public Chequing(String branchNum) {
        super(branchNum);
    }
    public Chequing(String branchNum, double debitLimit) {
        super(branchNum);
        this.debitLimit =  debitLimit;
    }
    public double getDebitLimit() {
        return debitLimit;
    }

    public void setDebitLimit(double limit) {
        this.debitLimit = limit;
    }

    public int getNumTransactions() {
        return numTransactions;
    }

    public void resetTransactions() {
        this.numTransactions = 0;
    }

    public void calcFees(){
        double currBalance = super.getBalance();
        int transFee = 1;
        int numTransactions = this.numTransactions;
        int monthFee = 10;
        double newBalance = currBalance-((transFee*numTransactions) + monthFee);
        super.setBalance(newBalance);


    }
}
