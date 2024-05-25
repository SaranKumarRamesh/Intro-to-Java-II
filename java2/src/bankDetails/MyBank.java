package bankDetails;

import java.util.ArrayList;

public class MyBank {
    ArrayList<Customer> customers = new ArrayList<>();

    public Account findAccount(Account accountNum) {
        ArrayList<Customer> customList = new ArrayList<>(customers);
        for (Customer customer : customList) {
            if (customer.equals(accountNum)) {
               return accountNum;
           }
        }
        return null;
    }

    public Account getCustomerAccounts(Account accountNum) {
        ArrayList<Customer> customList = new ArrayList<>(customers);
        for (Customer customer : customList) {
            if (customer.equals(accountNum)) {
                return accountNum;
            }
        }
        return null;
    }

    public static void addCustomer(String customerNum,String customerFname,String customerLname){
        Customer customer = new Customer(customerNum,customerFname,customerLname);

    }
}
