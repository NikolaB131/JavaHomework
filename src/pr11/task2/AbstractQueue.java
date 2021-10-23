package pr11.task2;

public abstract class AbstractQueue implements Queue {
    protected int size;

    public abstract void enqueue(Object element);
    public abstract Object element();
    public abstract Object dequeue();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (size != 0) {
            dequeue();
        }
    }
}
