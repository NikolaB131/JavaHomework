package lab9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа!");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        } finally {
            System.out.println("Блок finally выполняется в любом случае, даже если программа завершилась с ошибкой");
        }
    }
}

