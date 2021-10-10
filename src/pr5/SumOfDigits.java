package pr5;

public class SumOfDigits {
    public static int start(int n, int sum) {
        if (n != 0) {
            sum += n % 10; // прибавляем последнюю цифру в числе n к sum
            n /= 10;
            return start(n, sum);
        }
        return sum;
    }
}
