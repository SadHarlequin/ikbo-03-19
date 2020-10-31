package lab_9;

import java.util.Scanner;

public class ThrowsDemo2 {
    public static void main(String[] args) {
        getKey();
    }
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);

    }

    public static void printDetails(String key) {
        try {
            System.out.println(getDetails(key));
        } catch (Exception e) {
            //throw e;
            System.out.println("Empty string");
        }
    }

    private static String getDetails(String key){
        if(key == ""){
            throw new NullPointerException("Key set to empty string");
        }
        return "data for " + key;
    }
}