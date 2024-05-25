package personClasses;

/**
 * The Manager class is used to represent the Video Store manager.
 * The manager supervises the employees in the store and performs
 * other duties.
 * The Manager class inherits from the Person class.
 */
public class Manager extends Employee {
    /**
     * Default Constructor
     */
    public Manager() {
        //super() invoked automatically
    }

    /**
     * Constructor to initialize the class
     *
     * @param fName  The person's first name
     * @param lName  The person's last name
     * @param age    The person's age
     * @param sin    The person's social insurance number
     * @param salary The manager's yearly salary
     */
    public Manager(String fName, String lName, int age, int sin,
                   double salary) {
        // have the super class deal with fName, lName, age, sin, salary
        super(fName, lName, age, sin, 0, salary);
    }

    /**
     * Get the manager's pay. This method overrides (hides) the method in
     * Employee, since a Manager is paid a flat salary.
     *
     * @return The manager's gross pay.
     */
    public double getGrossPay() {
        return getPay();
    }

    public Manager clone() {
        Manager copy = (Manager) super.clone();
        // even though there are no new attributes, it is still useful to
        // override clone so that the return type is the same as this class.
        return copy;
    }
}
