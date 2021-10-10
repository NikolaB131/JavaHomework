package pr5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("|Упражнение 3|\nВведите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число B: ");
        int b = in.nextInt();
        AToB.start(a, b);
        System.out.print("\n|Упражнение 5|\nВведите число: ");
        int n = in.nextInt();
        System.out.print(SumOfDigits.start(n, 0));
        System.out.print("\n|Упражнение 14|\nВведите число N: ");
        n = in.nextInt();
        DigitsLeftToRight.start(n);
        System.out.print("\n|Упражнение 15|\nВведите число N: ");
        n = in.nextInt();
        DigitsRightToLeft.start(n);
        in.close();
    }
}
