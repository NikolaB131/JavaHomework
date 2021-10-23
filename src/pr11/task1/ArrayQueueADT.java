package pr11.task1;

public class ArrayQueueADT { // реализация с передачей экземпляра через параметры
    private Object[] queue = new Object[0];
    private int size;

    public static void enqueue(ArrayQueueADT queue, Object element) {
        Object[] newQueue = new Object[queue.size + 1]; // увеличение массива элементов
        for (int i = 0; i < queue.size; i++) { // копирование старого массива в новый
            newQueue[i] = queue.queue[i];
        }

        newQueue[queue.size] = element; // добавление нового элемента в конец очереди
        queue.queue = newQueue;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        if (queue.size > 0) {
            return queue.queue[0]; // индекс 0 - голова очереди
        }
        return null;
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size > 0) {
            Object temp = queue.queue[0]; // индекс 0 - голова очереди
            Object[] newQueue = new Object[queue.size - 1]; // уменьшение массива элементов
            for (int i = 1; i < queue.size; i++) { // копирование старого массива в новый без первого элемента
                newQueue[i - 1] = queue.queue[i];
            }
            queue.queue = newQueue;
            queue.size--;
            return temp;
        }
        return null;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.queue = new Object[0];
        queue.size = 0;
    }
}
