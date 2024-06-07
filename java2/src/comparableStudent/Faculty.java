package comparableStudent;

import java.util.Date;

public class Faculty extends Person implements Comparable<Faculty>, Cloneable, custom {
    private String employeeNum;
    private String department;
    private String[] courses;

    public Faculty(String employeeNum) {
        super("Teacher", "B", "canada", "562-456-6789");
        this.employeeNum = employeeNum;
    }


    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Faculty faculty)  {
            return this.employeeNum.equals(((Faculty) o).employeeNum);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Full name: " + super.getFirstName() + " " + super.getLastName() + "Emp Num:" + employeeNum + "Dept:" + department;
    }

    public int compareTo(Faculty f)
    {
        return this.employeeNum.compareTo(f.employeeNum);
    }

    public Faculty clone()
    {
        Faculty copy = null;

        try
        {
            copy = (Faculty) super.clone();

//            copy.employeeNum = (String) this.employeeNum.clone();
//            copy.department = (String) this.department.clone();
            copy.courses = (String[]) this.courses.clone();

        }
        catch (CloneNotSupportedException c)
        {
            System.out.println("Error!!!");
        }
        return copy;
    }

    @Override
    public boolean enrol() {
        System.out.println(super.getFirstName() + " " + super.getLastName() + " is enrolled in" + department);
        return true;
    }

    @Override
    public void print() {
        System.out.println("hey i am faculty");
    }
}
