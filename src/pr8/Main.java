package pr8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("...WaitList...");
        WaitList<Integer> waitList = new WaitList<>();
        System.out.println("Пуста ли очередь? " + waitList.isEmpty());
//        waitList.remove(); // при попытке удаления первого элемента создастся exception
        waitList.add(12);
        waitList.add(26);
        waitList.add(77);
        System.out.println(waitList);
        System.out.println("Пуста ли очередь? " + waitList.isEmpty());
        System.out.println("Удаление первого элемента...");
        waitList.remove();
        System.out.println(waitList);
        System.out.println("Проврека очереди на содержание элемента 26: " + waitList.contains(26));
        System.out.println("Проврека очереди на содержание элемента 27: " + waitList.contains(27));
        System.out.println("создание ArrayList с элементами 12, 26, 77");
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(12);
        intArr.add(26);
        intArr.add(77);
        System.out.println("Содержит ли очередь все элементы ArrayList: " + waitList.containsAll(intArr));
        System.out.println("Добавление в очередь элементов 99, 12...");
        waitList.add(99);
        waitList.add(12);
        System.out.println(waitList);
        System.out.println("Содержит ли очередь все элементы ArrayList: " + waitList.containsAll(intArr));

        System.out.println("\n...BoundedWaitList...");
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(4);
        System.out.println("Создание BoundedWaitList емкостью 4 с элементами 15, 17, 19");
        boundedWaitList.add(15);
        boundedWaitList.add(17);
        boundedWaitList.add(19);
        System.out.println(boundedWaitList);
        System.out.println("Емкость: " + boundedWaitList.getCapacity());
        System.out.println("Добавление элемента 12");
        boundedWaitList.add(12);
        System.out.println(boundedWaitList);
//        boundedWaitList.add(1); // при попытке добавления еще одного элемента создастся exception

        System.out.println("\n...UnfairWaitList...");
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        System.out.println("Добавление в очередь элементов 101, 102, 103...");
        unfairWaitList.add(101);
        unfairWaitList.add(102);
        unfairWaitList.add(103);
        unfairWaitList.add(104);
        unfairWaitList.add(105);
        System.out.println(unfairWaitList);
        System.out.println("Перемещение элемента 103 в конец...");
        unfairWaitList.moveToBack(103);
        System.out.println(unfairWaitList);
        System.out.println("Перемещение элемента 101 в конец...");
        unfairWaitList.moveToBack(101);
        System.out.println(unfairWaitList);
        unfairWaitList.moveToBack(1000); // если элемента нету в очереди, то ничего не произойдет
    }
}
