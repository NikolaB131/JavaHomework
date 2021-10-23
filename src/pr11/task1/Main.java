package pr11.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("...ArrayQueueModule...");
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println("Добавление элементов: 10, 15, 20");
        ArrayQueueModule.enqueue(10);
        ArrayQueueModule.enqueue(15);
        ArrayQueueModule.enqueue(20);
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println("Очередь пуста: " + ArrayQueueModule.isEmpty());
        System.out.println("Первый элемент очереди: " + ArrayQueueModule.element());
        System.out.println("Удаление первого элемента очереди: " + ArrayQueueModule.dequeue());
        System.out.println("Первый элемент очереди: " + ArrayQueueModule.element());
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println("Очистка очереди...");
        ArrayQueueModule.clear();
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println("Очередь пуста: " + ArrayQueueModule.isEmpty());


        ArrayQueueADT queue2 = new ArrayQueueADT();
        System.out.println("\n...ArrayQueueADT...");
        System.out.println("Размер: " + ArrayQueueADT.size(queue2));
        System.out.println("Добавление элементов: 6, 7, 8");
        ArrayQueueADT.enqueue(queue2, 6);
        ArrayQueueADT.enqueue(queue2, 7);
        ArrayQueueADT.enqueue(queue2, 8);
        System.out.println("Размер: " + ArrayQueueADT.size(queue2));
        System.out.println("Очередь пуста: " + ArrayQueueADT.isEmpty(queue2));
        System.out.println("Первый элемент очереди: " + ArrayQueueADT.element(queue2));
        System.out.println("Удаление первого элемента очереди: " + ArrayQueueADT.dequeue(queue2));
        System.out.println("Первый элемент очереди: " + ArrayQueueADT.element(queue2));
        System.out.println("Размер: " + ArrayQueueADT.size(queue2));
        System.out.println("Очистка очереди...");
        ArrayQueueADT.clear(queue2);
        System.out.println("Размер: " + ArrayQueueADT.size(queue2));
        System.out.println("Очередь пуста: " + ArrayQueueADT.isEmpty(queue2));


        ArrayQueue queue3 = new ArrayQueue();
        System.out.println("\n...ArrayQueue...");
        System.out.println("Размер: " + queue3.size());
        System.out.println("Добавление элементов: 1001, 1002, 1003");
        queue3.enqueue(1001);
        queue3.enqueue(1002);
        queue3.enqueue(1003);
        System.out.println("Размер: " + queue3.size());
        System.out.println("Очередь пуста: " + queue3.isEmpty());
        System.out.println("Первый элемент очереди: " + queue3.element());
        System.out.println("Удаление первого элемента очереди: " + queue3.dequeue());
        System.out.println("Первый элемент очереди: " + queue3.element());
        System.out.println("Размер: " + queue3.size());
        System.out.println("Очистка очереди...");
        queue3.clear();
        System.out.println("Размер: " + queue3.size());
        System.out.println("Очередь пуста: " + queue3.isEmpty());
    }
}
