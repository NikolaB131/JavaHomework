package pr11.task1;

public class ArrayQueue { // стандартная реализация
    private Object[] queue = new Object[0];
    private int size;

    public void enqueue(Object element) {
        Object[] newQueue = new Object[size + 1]; // увеличение массива элементов
        for (int i = 0; i < size; i++) { // копирование старого массива в новый
            newQueue[i] = queue[i];
        }

        newQueue[size] = element; // добавление нового элемента в конец очереди
        queue = newQueue;
        size++;
    }

    public Object element() {
        if (size > 0) {
            return queue[0]; // индекс 0 - голова очереди
        }
        return null;
    }

    public Object dequeue() {
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

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        queue = new Object[0];
        size = 0;
    }
}
