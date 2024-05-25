package classesCustomInterface;

import java.util.Date;

public class Student extends Person implements Comparable<Student>, Cloneable,custom{
    private String studentNum;
    private Date enrolDate;
    private String[] classList;

    public Student(String studentNum) {
        super("Saran", "Kumar", "canada", "123-456-6789");
        this.studentNum = studentNum;
    }

    public Student(String fName, String lName) {
        super("", "", "canada", "123-456-6789");
        super.setFirstName(fName);
        super.setLastName(lName);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Student student)  {
            return this.studentNum.equals(((Student) o).studentNum);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Full name: " + super.getFirstName() + " " + super.getLastName() + "Stud Num:" + studentNum;
    }

    @Override
    public int compareTo(Student std) {
        return this.studentNum.compareTo(std.studentNum);
    }

    public Student clone()
    {
        Student copy = null;

        try
        {
            copy = (Student) super.clone();
//            copy.studentNum = (String) this.studentNum.clone();
            copy.enrolDate = (Date) this.enrolDate.clone();
            copy.classList = (String[]) this.classList.clone();

        }
        catch (CloneNotSupportedException c)
        {
            System.out.println("Error!!!");
        }
        return copy;
    }

    @Override
    public boolean enrol() {
        System.out.println(super.getFirstName() + " " + super.getLastName() + " is enrolled in with student number" + studentNum);
        return true;
    }

    @Override
    public void print() {
        System.out.println("hey i am faculty");
    }
}
