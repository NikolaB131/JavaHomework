package pr11.task2;

public interface Queue {
    int size = 0;
    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
