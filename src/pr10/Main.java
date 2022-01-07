package pr10;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory factory = new ChairFactory();

        client.setChair(factory.createMagicChair());
        client.sit();
        if (client.chair.getClass().getSimpleName().equals("MagicChair")) {
            ((MagicChair) client.chair).doMagic();
        }
        System.out.println();

        client.setChair(factory.createFunctionalChair());
        client.sit();
        if (client.chair.getClass().getSimpleName().equals("FunctionalChair")) {
            System.out.printf("Сумма 5 и 5: %d\n\n", ((FunctionalChair) client.chair).sum(5, 5));
        }

        client.setChair(factory.createVictorianChair(99));
        client.sit();
        if (client.chair.getClass().getSimpleName().equals("VictorianChair")) {
            System.out.printf("Возраст стула: %d\n", ((VictorianChair) client.chair).getAge());
        }
    }
}
