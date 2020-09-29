package practice_6;

public class main {
    public static void main(String[] args) {

        Students[] iDNumber ={
                new Students("Mikhail", (int)(Math.random()*(5))+1),
                new Students("Simon", (int)(Math.random()*(5))+1),
                new Students("Nikita", (int)(Math.random()*(5))+1),
                new Students("Oleg", (int)(Math.random()*(5))+1)
        };

        SortingStudentsByGPA.sort(iDNumber);
    }
}