package pr5;

public class DigitsRightToLeft {
    public static void start(int n) {
        if (n != 0) {
            System.out.printf("%s ",n % 10);
            start(n / 10);
        }
    }
}
