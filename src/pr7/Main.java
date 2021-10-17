package pr7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            ArrayDeque<Integer> firstDeck = new ArrayDeque(5);
            ArrayDeque<Integer> secondDeck = new ArrayDeque(5);
            int turns = 0;
            System.out.print("|Игра в пьяницу|\nВведите пять карт первого игрока (номиналом от 0 до 9): ");
            for (int i = 0; i < 5; i++) {
                firstDeck.addLast(in.nextInt());
            }
            System.out.print("Введите пять карт второго игрока (номиналом от 0 до 9): ");
            for (int i = 0; i < 5; i++) {
                secondDeck.addLast(in.nextInt());
            }
            while (true) {
                if (turns > 105) {
                    System.out.print("botva");
                    break;
                } else if (firstDeck.isEmpty()) {
                    System.out.printf("Второй игрок победил! Количество ходов: %d", turns);
                    break;
                } else if (secondDeck.isEmpty()) {
                    System.out.printf("Первый игрок победил! Количество ходов: %d", turns);
                    break;
                }

                if (firstDeck.peekFirst() < secondDeck.peekFirst()) { // у первого игрока карта меньше
                    firstDeck.addLast(firstDeck.pollFirst());
                    firstDeck.addLast(secondDeck.pollFirst());
                    turns++;
                } else if (secondDeck.peekFirst() < firstDeck.peekFirst()) { // у второго игрока карта меньше
                    secondDeck.addLast(firstDeck.pollFirst());
                    secondDeck.addLast(secondDeck.pollFirst());
                    turns++;
                }
            }
            System.out.print("\nСыграть еще раз?\nВыбор (y/n): ");
            if (in.next().equals("n")) {
                break;
            }
        }
    }
}
