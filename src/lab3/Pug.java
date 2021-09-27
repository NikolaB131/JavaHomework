package lab3;

public class Pug extends Dog {
    public Pug(String name, int age) {
        super(name, age);
    }

    @Override
    public String getBreed() {
        return "Pug";
    }
}
