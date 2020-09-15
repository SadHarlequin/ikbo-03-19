package practice_5;

import java.util.Scanner;

public class Recursion {

    public static void r14(int n){
        if (n>0){
            r14(n/10);
            System.out.println(n%10);
        }
        else return;
    }

    public static void r15(int n){
        if (n>0){
            System.out.println(n%10);
            r15(n/10);
        }
        else return;
    }

    public static void r16(int n, int max, int kolvo){
        if (n==0){
            System.out.println("Количество встреч наибольшего числа: " + kolvo);
            return;
        }
        else{
            if (n==max) kolvo++;
            if (n>max){
                max=n;
                kolvo=1;
            }
            Scanner sc = new Scanner(System.in);
            r16(sc.nextInt(),max,kolvo);
            return;
        }
    }

    public static int r17(){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0){
            return 0;
        }
        else{
            return Math.max(n, r17());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("14. Введите число n.");
        int t1=sc.nextInt();
        System.out.println("Цифры числа слева-направо:");
        r14(t1);
        System.out.println();

        System.out.println("15. Введите число n.");
        int t2=sc.nextInt();
        System.out.println("Цифры числа справа-налево:");
        r15(t2);
        System.out.println();

        System.out.println("16. Введите построчно числа, завершите ввод нулём. Программа выдаст количество повторений наибольшего элемента");
        r16(sc.nextInt(), 0, 0);
        System.out.println();

        System.out.println("17. Введите построчно числа, завершите ввод нулём. Программа выдаст наибольший элемент");
        System.out.println("Наибольший элемент: "+r17());
        System.out.println();
    }
}
