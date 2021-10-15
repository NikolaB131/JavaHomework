package lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("|Меню|\n" +
                    "1. Создать файл в папке lab8\n" +
                    "2. Удалить файл в папке lab8\n" +
                    "3. Записать в файл\n" +
                    "4. Заменить строки в файле\n" +
                    "5. Выход из программы\n" +
                    "Выбор: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите имя файла: ");
                    if (new File("src/lab8/" + in.nextLine()).createNewFile()) {
                        System.out.print("Файл создан!\n\n");
                    } else {
                        System.out.println("Файл с таким именем уже существует!\n\n");
                    }
                    break;
                case 2:
                    System.out.print("Введите имя файла: ");
                    if (new File("src/lab8/" + in.nextLine()).delete()) {
                        System.out.print("Файл удалён!\n\n");
                    } else {
                        System.out.print("Файл с таким именем не найден!\n\n");
                    }
                    break;
                case 3:
                    System.out.print("Введите имя файла: ");
                    FileWriter file = new FileWriter("src/lab8/" + in.nextLine());
                    if (new FileWriter("src/lab8/" + in.nextLine()).) {
                        while (true) {
                            if (!in.nextLine().isEmpty()) {
                                new FileWriter("")
                            }
                        }
                    } else {
                        System.out.print("Файл с таким именем не найден!\n\n");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    in.close();
                    return;
            }
        }
    }
}
