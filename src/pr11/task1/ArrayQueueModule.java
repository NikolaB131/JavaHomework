package pr11.task1;

public class ArrayQueueModule { // реализация одним классом (одним экземпляром)
    private static Object[] queue = new Object[0];
    private static int size;

    public static void enqueue(Object element) {
        Object[] newQueue = new Object[size + 1]; // увеличение массива элементов
        for (int i = 0; i < size; i++) { // копирование старого массива в новый
            newQueue[i] = queue[i];
        }

        newQueue[size] = element; // добавление нового элемента в конец очереди
        queue = newQueue;
        size++;
    }

    public static Object element() {
        if (size > 0) {
            return queue[0]; // индекс 0 - голова очереди
        }
        return null;
    }

    public static Object dequeue() {
        if (size > 0) {
            Object temp = queue[0]; // индекс 0 - голова очереди
            Object[] newQueue = new Object[size - 1]; // уменьшение массива элементов
            for (int i = 1; i < size; i++) { // копирование старого массива в новый без первого элемента
                newQueue[i - 1] = queue[i];
            }
            queue = newQueue;
            size--;
            return temp;
        }
        return null;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        queue = new Object[0];
        size = 0;
    }
}
