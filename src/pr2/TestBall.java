package pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(56, 23);
        System.out.println(b1.toString());
        b1.move(44, 77);
        System.out.println(b1.toString());
    }
}
