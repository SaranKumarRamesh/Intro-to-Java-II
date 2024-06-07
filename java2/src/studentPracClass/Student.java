package studentPracClass;

public class Student {
    private int id;

    private String name;
    private float grade;

    Student() {
        this(0,"",0.0f);
    }

    Student(int id, String name, float grade) {
        setId(id);
        setName(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "ID: " + getId() + "Name: " + getName() + "Grade: " + getGrade();
    }

    public boolean studentEquals(Student objOther){
        return (name.equals(objOther.name)) && (id == objOther.id)  && (grade == objOther.grade);
    }
}
