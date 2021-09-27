package lab3;

public class Sheepdog extends Dog {
    public Sheepdog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getBreed() {
        return "Sheepdog";
    }
}
