package pr6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> firstList = new ArrayList<>();
        ArrayList<Student> secondList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        System.out.println(s2.compareTo(s1) == 0);
        System.out.print("|Заполнение первого списка студентов|\n00 - конец ввода\n" +
                "Введите id студентов разделяя их пробелом: ");
        while (true) {
            String id = scanner.nextLine();
            if (id.equals("00")) {
                break;
            }
            firstList.add(new Student(Integer.parseInt(id)));
        }
        System.out.println("|Заполнение второго списка студентов|\n00 - конец ввода\n" +
                "Введите id студентов разделяя их пробелом: ");
        while (true) {
            String id = scanner.nextLine();
            if (id.equals("00")) {
                break;
            }
            secondList.add(new Student(Integer.parseInt(id)));
        }
        n = StudentSorting.mergeSort(firstList, secondList);
        System.out.print("Отсортированный массив: ");
        for (int i : n) {
            System.out.printf("%s ", i);
        }
    }
}
