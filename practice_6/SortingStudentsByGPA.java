package practice_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Students> {


    public static void sort (Students[] listStudents){
        int n = listStudents.length;
        QuickSort quick = new QuickSort();
        quick.sort(listStudents, 0, n-1);
        QuickSort.printArray(listStudents);
    }

    @Override
    public int compare(Students o1, Students o2) {
        return o1.compareTo(o2);
    }
}