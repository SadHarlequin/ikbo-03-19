package lab_9;

import java.util.Scanner;

public class ThrowsDemo3 {
    public static void main(String[] args) throws Exception {
            getKey();
    }
    public static void getKey() throws Exception{
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e){
            System.out.println("Empty string");
        }
    }

    public static void printDetails(String key) throws Exception {
        System.out.println(getDetails(key));
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}