package pr5;

public class AToB {
    public static void start(int A, int B) {
        if (A == B) {
            System.out.print(A);
            return;
        }
        if (A < B) {
            System.out.printf("%s ", A);
            start(A + 1, B);
        }
        else {
            System.out.printf("%s ", A);
            start(A - 1, B);
        }
    }
}
