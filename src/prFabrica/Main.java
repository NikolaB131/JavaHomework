package prFabrica;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractChairFactory factory = new ChairFactory();

        client.setChair(factory.createVictorianChair());
        client.sit();

        client.setChair(factory.createMagicChair());
        client.sit();

        client.setChair(factory.createFunctionalChair());
        client.sit();
    }
}
