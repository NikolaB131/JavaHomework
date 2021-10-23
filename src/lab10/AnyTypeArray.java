package lab10;

public class AnyTypeArray<T> {
    private final T[] arr;

    public AnyTypeArray(int size) {
        arr = (T[]) new Object[size]; // создается массив типа Object с размером size и выполняется Downcasting
    }

    public void set(int index, T value) {
        arr[index] = value;
    }

    public T get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }

    public void print() { // вывод всех элементов на экран
        for (T value : arr) {
            System.out.printf("%s ", value);
        }
        System.out.print("\b");
    }
}
