package pr11.task2;

public class ArrayQueue extends AbstractQueue {
    private Object[] queue = new Object[0];

    @Override
    public void enqueue(Object element) {
        Object[] newQueue = new Object[size + 1]; // увеличение массива элементов
        for (int i = 0; i < size; i++) { // копирование старого массива в новый
            newQueue[i] = queue[i];
        }

        newQueue[size] = element; // добавление нового элемента в конец очереди
        queue = newQueue;
        size++;
    }

    @Override
    public Object element() {
        if (size > 0) {
            return queue[0]; // индекс 0 - голова очереди
        }
        return null;
    }

    @Override
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
}
