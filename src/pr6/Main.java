package pr6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(2);
        Student s2 = new Student(2);
//        System.out.println(s2.compareTo(s1) == 0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве: ");
        int length = scanner.nextInt();
        int[] n = new int[length];
//        System.out.print("Введите числа в массив разделяя их пробелом: ");
//        for (int i = 0; i < length; i++) {
//            n[i] = scanner.nextInt();
//        }
        int[] l = new int[] {1, 3};
        int[] r = new int[] {2, 4, 5, 1, 4};
        n = StudentSorting.mergeSort(l, r);
        System.out.print("Отсортированный массив: ");
        for (int i : n) {
            System.out.printf("%s ", i);
        }
    }
}
