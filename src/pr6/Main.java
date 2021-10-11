package pr6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> firstList = new ArrayList<>();
        ArrayList<Student> secondList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("|Заполнение первого списка студентов|\nлюбое введенное не число - конец ввода\n" +
                "Введите id студентов разделяя их пробелом: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                firstList.add(new Student(id));
            }
            else {
                break;
            }
        }
        scanner = new Scanner(System.in); // очистка
        System.out.print("|Заполнение второго списка студентов|\nлюбое введенное не число - конец ввода\n" +
                "Введите id студентов разделяя их пробелом: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                secondList.add(new Student(id));
            }
            else {
                break;
            }
        }
        ArrayList<Student> n = StudentSorting.mergeSort(firstList, secondList);
        System.out.println("Отсортированный массив:");
        for (Student i : n) {
            System.out.printf("%s, id: %s\n", i, i.getId());
        }
        scanner.close();
    }
}
