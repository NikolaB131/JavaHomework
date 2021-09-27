package lab4;

public class Table extends ShopItem {
    Table(double price) {
        super(price);
    }

    @Override
    public void printName() {
        System.out.println("A table");
    }
}
