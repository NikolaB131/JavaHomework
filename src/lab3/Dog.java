package lab3;

public abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getBreed();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
