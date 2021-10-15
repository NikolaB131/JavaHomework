package lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    |Меню|
                    1. Создать файл в каталоге src/lab8/
                    2. Удалить файл в каталоге src/lab8/
                    3. Записать текст в файл (удаляет содержимое старого файла)
                    4. Выход из программы
                    Выбор:\s"""); // \s - пробел
            int choice = in.nextInt();
            in.nextLine(); // необходим, т.к. следующий nextLine ничего не считает (после числа)

            switch (choice) {
                case 1 -> {
                    System.out.print("Введите имя файла: ");
                    if (new File("src/lab8/" + in.nextLine()).createNewFile()) {
                        System.out.print("Файл создан!\n\n");
                    } else {
                        System.out.print("Файл с таким именем уже существует!\n\n");
                    }
                }
                case 2 -> {
                    System.out.print("Введите имя файла: ");
                    if (new File("src/lab8/" + in.nextLine()).delete()) {
                        System.out.print("Файл удалён!\n\n");
                    } else {
                        System.out.print("Файл с таким именем не найден!\n\n");
                    }
                }
                case 3 -> {
                    System.out.print("Введите имя файла: ");
                    String name = in.nextLine();
                    if (new File("src/lab8/" + name).exists()) {
                        FileWriter writer = new FileWriter("src/lab8/" + name);
                        String text;
                        boolean firstLine = true;
                        System.out.println("Файл открыт для записи!");
                        while (true) {
                            text = in.nextLine();
                            if (text.isEmpty()) {
                                writer.close();
                                System.out.println("Данные записаны!");
                                break;
                            }
                            if (firstLine) { // для того чтобы в конце файла не было пустой строки
                                firstLine = false;
                            } else {
                                writer.append('\n');
                            }
                            writer.append(text);
                        }
                    } else {
                        System.out.print("Файл с таким именем не найден!\n\n");
                    }
                }
                case 4 -> {
                    in.close();
                    return;
                }
                default -> {
                }
            }
        }
    }
}
