package inheritanceEmployee;

public class Employee {
    private int employeeNum;
    private String firstName;
    private String lastName;
    private String deptCode;
    private String email;
    private double salary;

    public Employee() {
        this(11111, "John", "Doe");
    }

    public Employee(int employeeNum, String firstName, String lastName) {
        this(employeeNum,firstName,lastName,"","",0);
    }
    public Employee(int employeeNum, String firstName, String lastName, String deptCode, String email, double salary) {
        this.employeeNum = employeeNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptCode = deptCode;
        this.email = email;
        if(salary >= 0)
            this.salary = salary;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "employeeNum=" + employeeNum + ", firstName='" + firstName +  ", lastName='" + lastName ;
    }

    @Override
    public boolean equals(Object obj) {
        /**
        if( obj instanceof Employee ) {
            Employee e = (Employee) obj;
            if (this.employeeNum == e.employeeNum) {
                return true;
            }
            else  {
                return false;
            }
        }        return false;
         */

        /** Alternate method for the above code equals
        if( obj instanceof Employee ) {
            if (this.employeeNum == ((Employee) obj).employeeNum) {
                return true;
            }
            else  {
                return false;
            }
        }
        return false;
                 */
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            if (this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
