package comparableStudent;

public class TestPerson {
    public static void main(String[] args) {

        Student s1 = new Student("Dipal", "Raval");

//        System.out.println(s1.toString());

        Student s2 = s1.clone();

        System.out.println(s2.getFirstName());

//        System.out.println(s1.enrol());
    }
}
