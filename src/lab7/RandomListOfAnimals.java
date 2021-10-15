package lab7;

import java.util.ArrayList;

public class RandomListOfAnimals {
    public static void main(String[] args) {
        String[] arrayOfNames = {"Harry", "William", "James", "Logan", "Emma", "Olivia", "Isabella", "Sophia"};
        ArrayList<Animal> listOfAnimals = new ArrayList<>();

        int numberOfAnimals = (int) (Math.random() * 10) + 1;
        for (int i = 0; i < numberOfAnimals; i++) {
            int typeOfAnimal = (int) (Math.random() * 3);
            switch (typeOfAnimal) {
                case 0:
                    listOfAnimals.add(new Cat(arrayOfNames[(int) (Math.random() * 8)], (int) (Math.random() * 15 + 1)));
                    break;
                case 1:
                    listOfAnimals.add(new Dog(arrayOfNames[(int) (Math.random() * 8)], (int) (Math.random() * 15 + 1)));
                    break;
                case 2:
                    listOfAnimals.add(new Snake(arrayOfNames[(int) (Math.random() * 8)], (int) (Math.random() * 15 + 1)));
                    break;
            }
        }

        if (numberOfAnimals == 1) {
            System.out.println("Случайный список из 1 животного:");
        } else {
            System.out.printf("Случайный список из %d животных:\n", numberOfAnimals);
        }
        for (int i = 0; i < listOfAnimals.size(); i++) {
            System.out.printf("Тип: %s, Имя: %s, Возраст: %d\n", listOfAnimals.get(i).getClass().getSimpleName(),
                                                             listOfAnimals.get(i).getName(),
                                                             listOfAnimals.get(i).getAge());
        }
    }
}
