package pr12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Person person = new Person();
        person.setSurname("Иванов");
        person.setName("Иван");
        person.setPatronymic("Иванович");
        person.getFullName();

        System.out.println("\nЗадание 2");
        AddressClassTest.startTest();

        System.out.println("\nЗадание 3");
        String[] shirts = {"S001,Black Polo Shirt,Black,XL",
                           "S002,Black Polo Shirt,Black,L",
                           "S003,Blue Polo Shirt,Blue,XL",
                           "S004,Blue Polo Shirt,Blue,M",
                           "S005,Tan Polo Shirt,Tan,XL",
                           "S006,Black T-Shirt,Black,XL",
                           "S007,White T-Shirt,White,XL",
                           "S008,White T-Shirt,White,L",
                           "S009,Green T-Shirt,Green,S",
                           "S010,Orange T-Shirt,Orange,S",
                           "S011,Maroon Polo Shirt,Maroon,S"};
        ArrayList<Shirt> tempShirts = new ArrayList<>();
        for (String shirt : shirts) {
            tempShirts.add(new Shirt(shirt));
        }
        Shirt[] newShirts = new Shirt[tempShirts.size()];
        newShirts = tempShirts.toArray(newShirts);


        System.out.println("\nЗадание 4");
        System.out.println("\nЗадание 5");
    }
}
