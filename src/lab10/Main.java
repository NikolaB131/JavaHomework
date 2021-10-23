package lab10;

public class Main {
    public static void main(String[] args) {
        // Задание 2 и 3
        AnyTypeArray<Integer> anyArray1 = new AnyTypeArray<>(4);
        for (int i = 0; i < anyArray1.length(); i++) {
            anyArray1.set(i, i);
        }
        AnyTypeArray<Double> anyArray2 = new AnyTypeArray<>(3);
        anyArray2.set(0, 3.5);
        anyArray2.set(1, 4.2);
        anyArray2.set(2, 7.3);
        AnyTypeArray<String> anyArray3 = new AnyTypeArray<>(2);
        anyArray3.set(0, "hey");
        anyArray3.set(1, "how are you?");

        anyArray1.print();
        System.out.println();
        anyArray2.print();
        System.out.println();
        anyArray3.print();

    }
}
