package practice_8;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<Integer> bwList = new BoundedWaitList<Integer>(5);
        for (int i = 0; i < 5; i++)
            bwList.add(i);
        try {
            bwList.add(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        }
        System.out.println();
        System.out.println(bwList.toString());

        System.out.println();

        UnfairWaitList<Integer> uwList = new UnfairWaitList<Integer>();
        for (int i = 0; i < 5; i++)
            uwList.add(i);
        uwList.remove(1);
        uwList.remove(2);
        System.out.println(uwList.toString());
        uwList.moveToBack(0);
        System.out.println(uwList.toString());
    }
}
