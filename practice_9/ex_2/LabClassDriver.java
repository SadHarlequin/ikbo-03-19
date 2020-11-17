package practice_9.ex_2;

import java.util.ArrayList;
import java.util.Comparator;

public class LabClassDriver implements LabClassUI {
    ArrayList<Student> students;

    public void space(){
        System.out.println("-----------------------");
    }

    public LabClassDriver() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void sortBySurname() {
        students.sort(Comparator.comparing(Student::getLastName));
    }

    @Override
    public void sortByGPA() {
        students.sort(new GPASort());
    }

    @Override
    public Student findByFIO(String name, String lastName, String secondName) throws NotFoundException {
        for (Student student: students)
            if (name.equals(student.getName()) && lastName.equals(student.getLastName()) && secondName.equals(student.getSecondName()))
                return student;
        throw new NotFoundException(name + " " + lastName + " " + secondName);
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void printAll() {
        for (Student student: students)
            System.out.println(student);
        space();
    }
}
