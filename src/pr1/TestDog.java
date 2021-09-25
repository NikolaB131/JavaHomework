package pr1;

public class TestDog {
    public static void main(String[] args) {
        Dog boxer = new Dog("Misha", 4);
        Dog dalmatian = new Dog("Ilya", 10);
        Dog dobermann = new Dog("Massie");
        dobermann.setAge(1);
        System.out.println(boxer);
        boxer.intoHumanAge();
        dalmatian.intoHumanAge();
        dobermann.intoHumanAge();
    }
}
