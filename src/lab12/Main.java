package lab12;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    |Меню|
                    1. Проверить список цен
                    2. Проверить есть ли в тексте цифры, за которыми не стоит знак "+"
                    3. Является ли строка датой
                    4. Проверка E-mail
                    5. Проверка пароля
                    6. Выход из программы
                    Выбор:\s"""); // \s - пробел
            int choice = in.nextInt();
            in.nextLine(); // необходим, т.к. следующий nextLine ничего не считает (после числа)

            switch (choice) {
                case 1 -> {
                    StringBuilder dataFromFile = new StringBuilder();
                    try {
                        FileReader reader = new FileReader("src/lab12/Prices");
                        while (true) {
                            int data = reader.read();
                            if (data == -1) { // если конец файла
                                reader.close();
                                break;
                            }
                            dataFromFile.append((char) data);
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Файл не найден!");
                        return;
                    } catch (IOException e) {
                        System.out.println("Ошибка ввода/вывода!");
                        return;
                    }

                    String[] lines = dataFromFile.toString().split("(\r?\n)+");
                    for (String line : lines) {
                        if (line.matches("[1-9][0-9]+\\.?[0-9]{0,2} (USD|RUB|EU)")) {
                            System.out.printf("Строка с ценой \"%s\" записана верно\n", line);
                        } else {
                            System.out.printf("Строка с ценой \"%s\" записана неверно\n", line);
                        }
                    }
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("Введите строку: ");
                    if (in.nextLine().matches("(.*[0-9]+ *\\+)+")) {
                        System.out.println("Цифры, за которыми не стоит знак \"+\" отсутствуют\n");
                    } else {
                        System.out.println("В тексте есть цифры, за которыми не стоит знак \"+\"\n");
                    }
                }
                case 3 -> {
                    System.out.print("Введите строку: ");
                    if (in.nextLine().matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19[0-9][0-9]|[2-9][0-9]{3})")) {
                        System.out.println("Строка является датой\n");
                    } else {
                        System.out.println("Строка не является датой\n");
                    }
                }
                case 4 -> {
                    System.out.print("Введите строку: ");
                    if (in.nextLine().matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")) {
                        System.out.println("Строка является e-mail адресом\n");
                    } else {
                        System.out.println("Строка не является e-mail адресом\n");
                    }
                }
                case 5 -> {
                    System.out.print("Введите строку: ");
                    String input = in.nextLine();
                    boolean hasUppercase = !input.equals(input.toLowerCase());
                    boolean hasLowercase = !input.equals(input.toUpperCase());
                    boolean hasDigit = input.matches(".*[0-9].*");
                    boolean isAtLeast8 = input.length() >= 8;
                    if (input.matches("[A-Za-z0-9_]+") && hasUppercase && hasLowercase && hasDigit) {
                        System.out.println("Пароль составлен надежно\n");
                    } else {
                        System.out.println("Пароль составлен не надежно\n");
                    }
                }
                case 6 -> {
                    in.close();
                    return;
                }
                default -> {
                }
            }
        }
    }
}
