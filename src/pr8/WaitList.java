package pr8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E> { // очередь по типу FIFO
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c) { // преобразование коллекции в список
        content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public String toString() {
        return String.format("WaitList{content=%s}", content);
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() { // удаляет и возвращает первый элемент очереди
        if (!isEmpty()) {
            return content.remove();
        } else {
            throw new NoSuchElementException("Очередь пуста!");
        }
    }

    @Override
    public boolean contains(E element) { // проверяет содержит ли список элемент
        boolean result = false;
        for (int i = 0; i < content.size(); i++) {
            E temp = content.remove(); // удаляем и запоминаем первый элемент очереди
            if (element.equals(temp)) { // проверям соответствует ли он искомому элементу
                result = true;
            }
            content.add(temp); // возвращаем элемент в конец очереди
        }
        return result;
    }

    @Override
    public boolean containsAll(Collection<E> c) { // проверяет есть ли элементы списка в коллекции (в любом порядке)
        ArrayList<E> collection = new ArrayList<>(c); // создаем копию коллекции в виде ArrayList
        for (int i = 0; i < c.size(); i++) {
            boolean result = false;
            for (int j = 0; j < content.size(); j++) { // просматриваем всю очередь на наличие элемента с индексом i
                E tempElement = content.remove(); // удаляем и запоминаем первый элемент очереди
                if (tempElement.equals(collection.get(i))) { // если элемент очереди равен i-тому элементу коллекции
                    result = true;
                }
                content.add(tempElement); // возвращаем элемент в конец очереди
            }
            if (!result) { // если элемент очереди не найден в коллекции
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
