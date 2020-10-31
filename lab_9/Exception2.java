package lab_9;

import java.util.Scanner;

public class Exception2 {
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
        } catch (NumberFormatException e){   //Qwerty, 1.2
            System.out.println("Only integer type");
        } catch(ArithmeticException e){   //0
            System.out.println("Attempted division by zero");
        }
    }
}