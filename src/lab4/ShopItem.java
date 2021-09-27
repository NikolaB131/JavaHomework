package lab4;

public abstract class ShopItem implements Priceable{
    private double price;

    ShopItem(double price) {
        this.price = price;
    }

    public abstract void printName();

    public double getPrice() {
        return price;
    }
}
