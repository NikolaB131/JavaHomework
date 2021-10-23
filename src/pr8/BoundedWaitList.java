package pr8;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    public BoundedWaitList(int capacity) {
        super(); // вызов конструктора по умолчанию WaitList
        if (capacity <= 0) {
            throw new IllegalArgumentException("Размер очереди должен быть больше 0!");
        }
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() == capacity) {
            throw new IllegalStateException("Добавление элемента невозможно, т.к. очередь заполнена!");
        }
        content.add(element);
    }

    @Override
    public String toString() {
        return String.format("BoundedWaitList{content=%s, capacity=%s}", content, capacity);
    }
}
