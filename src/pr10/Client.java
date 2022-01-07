package pr10;

public class Client {
    public Chair chair;

    public void sit() {
        try {
            System.out.println("Клиент сел на: " + chair.getClass().getSimpleName());
        } catch (Exception e) {
            System.out.println("Клиент сел куда-то...");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
