package lab9;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key: ");
        String key = myScanner.nextLine();
        try { // обработка исключения
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            getKey();
        } finally {
            myScanner.close();
        }
    }

    public void printDetails(String key) throws Exception { // пробрасывает исключение выше
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception { // пробрасывает исключение выше
        if(key.equals("")) {
            throw new Exception("Key set to empty string!"); // выброс исключения
        }
        return "Data for: " + key;
    }
}
