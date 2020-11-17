package practice_9.ex_2;

import java.util.Comparator;

public class GPASort implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return t1.getGpa() - student.getGpa();
    }
}