package lab4;

public class Test {
    public static void main(String[] args) {
        Table table = new Table(25.39);
        Chair chair = new Chair(15.59);
        Shelf shelf = new Shelf(9.99);

        table.printName();
        System.out.println(table.getPrice());

        chair.printName();
        System.out.println(chair.getPrice());

        shelf.printName();
        System.out.println(shelf.getPrice());
    }
}
