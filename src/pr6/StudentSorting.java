package pr6;

import java.util.ArrayList;

public class StudentSorting {
    public static ArrayList<Student> mergeSort(ArrayList<Student> firstList, ArrayList<Student> secondList) {
        ArrayList<Student> n = new ArrayList<>();
        n.addAll(firstList);
        n.addAll(secondList);
        Sort(n);
        return n;
    }

    private static void Sort(ArrayList<Student> n) {
        if (n.size() < 2) {
            return;
        }
        int mid = n.size() / 2; // середина массива, округление в меньшую сторону при нечетной длине
        ArrayList<Student> l = new ArrayList<>(); // левый подмассив
        ArrayList<Student> r = new ArrayList<>(); // правый подмассив

        for (int i = 0; i < mid; i++) { // вырезание левого подмассива из основного
            l.add(n.get(i));
        }
        for (int i = mid; i < n.size(); i++) { // вырезание правого подмассива из основного
            r.add(n.get(i));
        }
        // после того как мы разбили наш список, необходимо его удалить, чтобы не дублировать значения из-за рекурсии
        n.clear();

        Sort(l); // рекурсивно разделяет левый подмассив
        Sort(r); // рекурсивно разделает правый подмассив
        merge(n, l, r); // сливает два подмассива
    }

    private static void merge(ArrayList<Student> n, ArrayList<Student> l, ArrayList<Student> r) {
        int i = 0, j = 0;
        // пока не дойдем до конца l или r, выбрать наименьший элемент из l[i] и r[j]
        // и поставить его на правильное место в основном массиве
        while (i < l.size() && j < r.size()) {
            if (l.get(i).compareTo(r.get(j)) <= 0) {
                n.add(l.get(i++));
            }
            else { // элемент в левом подмассиве больше элемента в правом подмассиве
                n.add(r.get(j++));
            }
        }
        // если закончились элементы в одном из подмассивов, перенести оставшиеся элементы
        while (i < l.size()) { // если остались элементы в левом подмассиве
            n.add(l.get(i++));
        }
        while (j < r.size()) { // если остались элементы в правом подмассиве
            n.add(r.get(j++));
        }
    }
}
