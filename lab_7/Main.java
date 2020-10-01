package lab_7;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        System.out.println("Заполнение элементами коллекции:");
        list.addAll(Arrays.asList(arr));
        System.out.println(list.toString());
        System.out.println("Добавление 1 в начало");
        list.addFirst(1);
        System.out.println(list.toString());
        System.out.println("Добаление 6 в конец");
        list.addLast(6);
        System.out.println(list.toString());
        System.out.println("Добавление 6");
        list.add(6);
        System.out.println(list.toString());
        System.out.println("Есть ли число 6?");
        if (list.contains(6)) System.out.println("Есть");
        else System.out.println("Нет");
        System.out.println("Есть ли число 7?");
        if (list.contains(7)) System.out.println("Есть");
        else System.out.println("Нет");
        System.out.print("Элемент с индексом 4 - ");
        System.out.println(list.indexOf(4));
        System.out.println("Удаление первого элемента");
        list.removeFirst();
        System.out.println(list.toString());
        System.out.println("Удаление последнего элемента");
        list.removeLast();
        System.out.println(list.toString());
    }

}