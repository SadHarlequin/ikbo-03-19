package practice_9.ex_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotFoundException {
        LabClassUI classUI = new LabClass().getClassUI();
        classUI.add(new Student(3, "Mikhail", "Nikitin", "Evgenevich"));
        classUI.add(new Student(1, "Ivan", "Zotov", "Denisovich"));
        classUI.add(new Student(2, "Faceless", "Terror", "Temp"));
        classUI.printAll();
        classUI.sortByGPA();
        classUI.printAll();
        classUI.sortBySurname();
        classUI.printAll();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя: ");
        String name = scanner.nextLine();
        System.out.println("Фамилия: ");
        String surname = scanner.nextLine();
        System.out.println("Отчество: ");
        String patronymic = scanner.nextLine();
        classUI.findByFIO(name, surname, patronymic);
    }
}
