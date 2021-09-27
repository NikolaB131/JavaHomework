package lab3;

public class Beagle extends Dog {
    public Beagle(String name, int age) {
        super(name, age);
    }

    @Override
    public String getBreed() {
        return "Beagle";
    }
}
