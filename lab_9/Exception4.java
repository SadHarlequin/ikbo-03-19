package lab_9;

import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString); // 1
            System.out.println(2 / i);
        } catch (Exception e){   //Qwerty, 1.2, 0
            System.out.println("Oops, something wrong...");
        } finally {
            System.out.println("What did u expect to see here?"); //Вызывается всегда
        }


    }
}