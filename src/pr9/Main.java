package pr9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder dataFromFile = new StringBuilder();
        try {
            FileReader reader = new FileReader("src/pr9/INNList.txt");
            int data;
            while (true) {
                data = reader.read();
                if (data == -1) {
                    break;
                }
                dataFromFile.append((char) data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода!");
        }

        HashMap<String, String> INNMap = new HashMap<>();
        String[] lines = dataFromFile.toString().split("\r\n"); // запись каждой строки всего файла в массив строк
        for (String line : lines) {
            INNMap.put(line.substring(0, 12), line.substring(13));
        }

        System.out.print("|Чтобы оформить заказ введите ваше ФИО и ИНН|\nВаше ФИО: ");
        String name = in.nextLine();
        System.out.print("Введите ваш ИНН: ");
        String INN = in.next();

        if (INNMap.get(INN).equals(name)) {
            System.out.print("Заказ оформлен!");
        } else {
            try {
                throw new NotValidINN("ИНН не действителен!");
            } catch (NotValidINN e) {
                System.out.print("Ошибка: " + e.getMessage());
            }
        }

        in.close();
    }
}
