package lab4;

public class Shelf extends ShopItem {
    Shelf(double price) {
        super(price);
    }

    @Override
    public void printName() {
        System.out.println("A shelf");
    }
}
