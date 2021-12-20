package prFabrica;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("I sat down on the " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
