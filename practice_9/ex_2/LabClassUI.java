package practice_9.ex_2;

public interface LabClassUI {
    void sortBySurname();
    void sortByGPA();
    Student findByFIO(String name, String lastName, String secondName) throws NotFoundException;
    void add(Student student);
    void printAll();
}
