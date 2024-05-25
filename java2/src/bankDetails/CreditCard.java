package bankDetails;

public class CreditCard extends Account implements InterestApplicable{
    private double interestRate;
    private double creditLimit;

    public CreditCard(String branchNum) {
        super(branchNum);
    }
    public CreditCard(String branchNum, double InterestRate) {
        super(branchNum);
        this.interestRate = InterestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double limit) {
        this.creditLimit = limit;
    }

    public void calcFees(){
        double credBalance = super.getBalance();
        int fee = 20;
        double newBalance = credBalance-fee;
        super.setBalance(newBalance);
    }
}
