package bankDetails;

import java.util.ArrayList;

public class Customer {
    private String customerNum;
    private String customerFname;
    private String customerLname;
    private ArrayList<Account> Accounts;
    private ArrayList<Transaction> BankingHistory;

    public Customer(String customerNum, String customerFname, String customerLname) {
        this.customerNum = customerNum;
        this.customerFname = customerFname;
        this.customerLname = customerLname;
    }

    public void addAccount(String branchNum, String acctType){



    }

    public boolean addTransaction(String accountNum, double amount, String type ){
        BankingHistory.add(accountNum,amount,type);
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public String getCustomerFname() {
        return customerFname;
    }

    public void setCustomerFname(String customerFname) {
        this.customerFname = customerFname;
    }

    public String getCustomerLname() {
        return customerLname;
    }

    public void setCustomerLname(String customerLname) {
        this.customerLname = customerLname;
    }

    public ArrayList<Account> getAccounts() {
        return Accounts;
    }

    public ArrayList<Transaction> getBankingHistory() {
        return BankingHistory;
    }

    public String printAccountList(){
        return Accounts.toString()+"\n";

    }

    public String printBankStatement(String accountNum){
        return BankingHistory.toString() + "\n";

    }
}
