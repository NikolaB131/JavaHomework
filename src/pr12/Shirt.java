package pr12;

public class Shirt {
    private final String number;
    private final String description;
    private final String color;
    private final String size;

    public Shirt(String all) {
        String[] info = all.split(",");
        number = info[0];
        description = info[1];
        color = info[2];
        size = info[3];
    }

    @Override
    public String toString() {
        return "Артикул: " + number +
                "\nОписание: " + description +
                "\nЦвет: " + color +
                "\nРазмер: " + size;
    }
}
