package lab4;

public class Chair extends ShopItem {
    Chair(double price) {
        super(price);
    }

    @Override
    public void printName() {
        System.out.println("A chair");
    }
}
