package pr6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве: ");
        int length = scanner.nextInt();
        int[] n = new int[length];
        System.out.print("Введите числа в массив разделяя их пробелом: ");
        for (int i = 0; i < length; i++) {
            n[i] = scanner.nextInt();
        }
        for (int i : n) {
            System.out.println(i);
        }
    }
}
