package pr5;

public class DigitsLeftToRight {
    public static void start(int n) {
        if (n != 0) {
            start(n / 10);
            System.out.printf("%s ",n % 10);
        }
    }
}
