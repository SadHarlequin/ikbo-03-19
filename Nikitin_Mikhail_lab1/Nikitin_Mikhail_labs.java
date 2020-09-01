package ru.mirea.Nikitin_Mikhail_lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Nikitin_Mikhail_labs {

    public static int Factorial(int i){
        int k=1;
        int fac=1;
        while (k<i+1){
            fac*=k;
            k++;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int[] Arr = new int[5];
            for(int i = 0; i<5; i++) {
                Arr[i] = (int) (Math.random() * 10);
            }
            for (int i=0;i<5;i++){
                System.out.print(Arr[i]+" ");
            }
            System.out.println();
            int i=0;
            while(i <5) {
                System.out.print(Arr[i]+ " ");
                i++;
            }
            System.out.println();
            i=0;
            do {
                System.out.print(Arr[i]+ " ");
                i++;
            } while(i<5);
        } //первое задание
        {
            for (int i=0;i<args.length;i++) {
                System.out.print(args[i]);
            }
            System.out.println();
        } //второе задание
        {
            double r = 0;
            for (int k = 1; k < 11; k++) {
                r += (double) 1 / k;
                System.out.print(r + " ");
            }
            System.out.println();
        } //третье задание
        {
            int[] Arr = new int[5];
            for(int i = 0; i<5; i++) {
                Arr[i] = (int) (Math.random() * 10);
            }
            for (int i=0;i<5;i++){
                System.out.print(Arr[i]+" ");
            }
            System.out.println();
            Arrays.sort(Arr);
            for (int i=0;i<5;i++){
                System.out.print(Arr[i]+" ");
            }
        } //четвертое задание
        {
            System.out.println();
            int number = sc.nextInt();
            System.out.println(Factorial(number));
        }//пятое задание
    }

}
