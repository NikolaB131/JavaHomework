package prFabrica;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Doing magic...");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
