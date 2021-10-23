package pr11.task2;

public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    private static class Node {
        private Object element;
        private Node next;

        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public void enqueue(Object element) {
        if (size == 0) {
            head = tail = new Node(element, null);
        } else {
            tail = new Node(element, tail);
        }
        size++;
    }

    @Override
    public Object element() {
        if (size > 0) {
            return head.element;
        }
        return null;
    }

    @Override
    public Object dequeue() {
        if (size > 0) {
            Object tempElement = head.element;
            if (size == 1) {
                head = tail = null;
            } else {
                Node temp = tail;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = null;
                head = temp;
            }
            size--;
            return tempElement;
        }
        return null;
    }
}
