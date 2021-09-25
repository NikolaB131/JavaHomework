package lab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число, для которого необходимо вычислить факториал: ");
        int x = input.nextInt();
        System.out.printf("Факториал числа %d: %d", x, factorial(x));
    }

    static int factorial(int x) {
        int result = 1;
        while (x != 0) {
            result *= x;
            x--;
        }
        return result;
    }
}
