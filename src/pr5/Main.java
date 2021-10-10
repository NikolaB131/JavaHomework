package pr5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("|Упражнение 3|\nВведите число A: ");
        int A = in.nextInt();
        System.out.print("Введите число B: ");
        int B = in.nextInt();
        AToB.start(A, B);
        System.out.print("|Упражнение 14|\nВведите число N: ");
        int N = in.nextInt();
        in.close();
    }
}
