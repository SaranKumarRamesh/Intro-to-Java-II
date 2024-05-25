package personClasses;

/**
 * The employee class is used to store information about the video stores
 * employees, such as hoursWorked, wages, etc.
 */
public class Employee extends Person {
    private double pay;  //pay information
    private int hoursWorked; // hoursWorked per month

    /**
     * Default Constructor
     */
    public Employee() {
        //super(); // super is called by default, so this call is not required
        pay = 0;
        hoursWorked = 0;
    }

    /**
     * Constructor
     *
     * @param fName       The person's first name
     * @param lName       The person's last name
     * @param age         The person's age
     * @param sin         The person's social insurance number
     * @param hoursWorked Hours worked in a month
     * @param pay         Pay information.
     */
    public Employee(String fName, String lName, int age,
                    int sin, int hoursWorked, double pay) {
        // set values in Person class
        super(fName, lName, age, sin);
        this.pay = pay;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Get the employee's gross pay.
     *
     * @return The employee's gross pay.
     */
    public double getGrossPay() {
        double gross = pay * hoursWorked;
        return gross;
    }

    /**
     * This method return the pay of the employee
     *
     * @return pay of employee
     */
    public double getPay() {
        return pay;
    }

    /**
     * This method overrides the toString method in Person to add the details
     * specific to an Employee. The Person toString method is first invoked
     * using super.toString(), and then the Employee attributes are added.
     *
     * @return A string with the employee's values
     */
    public String toString() {
        // start with the parent's information
        StringBuffer str = new StringBuffer(super.toString());
        // now add the child class information
        str.append("[");
        str.append("pay=" + pay);
        str.append(", hoursWorked=" + hoursWorked);
        str.append("]");
        return str.toString();
    }

    /**
     * This method is used to compare to objects of the class type Employee
     *
     * @param obj The object to compare.
     * @return True if both objects are the same.
     */
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Employee) // test compatibility
        {
            Employee emp = (Employee) obj;
            if (super.equals(emp) && pay == emp.pay &&
                    hoursWorked == emp.hoursWorked) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Override the abstract method to format the Employee's name.
     *
     * @return The formatted employee string
     */
    public String getFormattedName() {
        String name = getLastName() + ", " + getFirstName();
        return name;
    }

    /**
     * The clone method is used to make a deep copy of the object.
     *
     * @return the cloned object
     */
    public Employee clone() {
        Employee copy = (Employee) super.clone();
        // deep copy any Employee non-primitive attributes
        // not applicable in this case.
        return copy;
    }
}
