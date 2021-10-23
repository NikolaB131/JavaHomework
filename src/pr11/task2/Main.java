package pr11.task2;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue1 = new ArrayQueue();
        System.out.println("\n...ArrayQueue...");
        System.out.println("Размер: " + queue1.size());
        System.out.println("Добавление элементов: 990, 995, 1000");
        queue1.enqueue(990);
        queue1.enqueue(995);
        queue1.enqueue(1000);
        System.out.println("Размер: " + queue1.size());
        System.out.println("Очередь пуста: " + queue1.isEmpty());
        System.out.println("Первый элемент очереди: " + queue1.element());
        System.out.println("Удаление первого элемента очереди: " + queue1.dequeue());
        System.out.println("Первый элемент очереди: " + queue1.element());
        System.out.println("Размер: " + queue1.size());
        System.out.println("Очистка очереди...");
        queue1.clear();
        System.out.println("Размер: " + queue1.size());
        System.out.println("Очередь пуста: " + queue1.isEmpty());


        LinkedQueue queue2 = new LinkedQueue();
        System.out.println("\n...LinkedQueue...");
        System.out.println("Размер: " + queue2.size());
        System.out.println("Добавление элементов: 222, 333, 444");
        queue2.enqueue(222);
        queue2.enqueue(333);
        queue2.enqueue(444);
        System.out.println("Размер: " + queue2.size());
        System.out.println("Очередь пуста: " + queue2.isEmpty());
        System.out.println("Первый элемент очереди: " + queue2.element());
        System.out.println("Удаление первого элемента очереди: " + queue2.dequeue());
        System.out.println("Первый элемент очереди: " + queue2.element());
        System.out.println("Размер: " + queue2.size());
        System.out.println("Очистка очереди...");
        queue2.clear();
        System.out.println("Размер: " + queue2.size());
        System.out.println("Очередь пуста: " + queue2.isEmpty());
    }
}
