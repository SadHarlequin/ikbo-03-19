package lab_9;

import java.util.Scanner;

public class Exception3 {
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
        }

        // Перехватываются любые исключения, единый алгоритм действий при их обнаружении.
    }
}