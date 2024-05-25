package bankDetails;

public class Savings extends Account implements InterestApplicable{
    private double interestRate;
    private int limitWithdrawsPerMonth;
    private int numWithdraws;


    public Savings(String branchNum) {
        super(branchNum);
    }

    public Savings(String branchNum, double startBalance) {
        super(branchNum);
        super.setBalance(startBalance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    public int getLimitWithdrawsPerMonth() {
        return limitWithdrawsPerMonth;
    }

    public void setLimitWithdrawsPerMonth(int limit) {
        this.limitWithdrawsPerMonth = limit;
    }

    public int getNumWithdraws() {
        return numWithdraws;
    }

    public void resetWithdraws() {
        this.numWithdraws = 0;
    }

    public void calcFees(){
        double savBalance = super.getBalance();
        int withdrawFee = 2;
        int numWithdraws = this.numWithdraws;
        int monthFee = 15;
        double newBalance = savBalance-((withdrawFee*numWithdraws) + monthFee);
        super.setBalance(newBalance);
    }
}
