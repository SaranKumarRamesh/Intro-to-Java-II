package bankDetails;

import java.util.Objects;

public abstract class Account implements Comparable<Account> {
    private String accountNum;
    private String institutionNum;
    private String branchNum;
    private String name;
    private String description;
    private double balance;
    private static int acctNumGenerator = 1000000;
    public Account(String branchNum) {
        this.branchNum = branchNum;
    }

    public Account(String branchNum, double balance) {
        this.branchNum = branchNum;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }
    public String getInstitutionNum() {
        return institutionNum;
    }
    public String getBranchNum() {
        return branchNum;
    }

    public void setBranchNum(String branchNum) {
        this.branchNum = branchNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNum, account.accountNum);
    }

    public abstract void calcFees();


    @Override
    public String toString() {
        return institutionNum + " - " + branchNum + " " + accountNum;
    }

    public int compareTo( Account other )
    {
        return accountNum.compareTo( other.accountNum);
    }
}
