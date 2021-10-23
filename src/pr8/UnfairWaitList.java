package pr8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super(); // вызов конструктора по умолчанию WaitList
    }

    public void remove(E element) { // удаляет первое вхождение элемента
        content.remove(element);
    }

    public void moveToBack(E element) { // перемещает элемент из головы в хвост
        int prevSize = content.size();
        remove(element); // вызывает метод этого класса
        if (content.size() < prevSize) { // если элемент удалился
            content.add(element); // добавляем элемент в конец очереди
        }
    }
}
