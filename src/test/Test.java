package test;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in - входной поток
        System.out.print("Введите что-нибудь: ");
        String string = scanner.nextLine();
        System.out.println(string);
        int number = 5; // примитивный тип данных
        int[] numbers = new int[15]; // ссылочный тип данных. Массив забит нулями
        int[] numbers1 = {1, 2, 3};
        String[] strings = new String[5]; // массив на 5 строк
        for (int i : numbers1) { // цикл for each, i принимает кажджое следующее значение
            System.out.println(i);
        }
        int sum = 0; // IntelliJ IDEA подчеркивает, т.к. переменная переопределяется
        for (int i : numbers1) {
            sum += i;
        }
        System.out.println("Сумма всех элементов numbers1: " + sum);
        int[][] matrix = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}}; // двумерный массив, в каждом подмассиве не обязательно должно быть 3 элемента
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
