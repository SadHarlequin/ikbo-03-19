package practice_9.ex_2;

public class Student {
    private int gpa;
    private String name;
    private String lastName;
    private String secondName;

    public Student(int gpa, String name, String lastName, String secondName) {
        this.gpa = gpa;
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public int getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
