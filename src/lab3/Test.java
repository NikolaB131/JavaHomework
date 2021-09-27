package lab3;

public class Test {
    public static void main(String[] args) {
        Beagle dog1 = new Beagle("Edgar", 2);
        Pug dog2 = new Pug("Maya", 8);
        Sheepdog dog3 = new Sheepdog("Puppy", 14);

        System.out.println(dog1.getBreed());
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        System.out.println();
        System.out.println(dog2.getBreed());
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());

        System.out.println();
        System.out.println(dog3.getBreed());
        System.out.println(dog3.getName());
        System.out.println(dog3.getAge());
    }
}
