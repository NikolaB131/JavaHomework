package pr6;

public class StudentSorting {
    public static int[] mergeSort(Student firstList, Student secondList) {
        return Sort(merge(new int[first.length + second.length], first, second));
    }

    private static int[] Sort(int[] n) {
        if (n.length < 2) { // если в массиве 1 элемент
            return n;
        }
        int mid = n.length / 2; // середина массива, округление в меньшую сторону при нечетной длине
        int[] l = new int[mid]; // левый подмассив
        int[] r = new int[n.length - mid]; // правый подмассив

        for (int i = 0; i < mid; i++) { // вырезание левого подмассива из основного
            l[i] = n[i];
        }
        for (int i = mid; i < n.length; i++) { // вырезание правого подмассива из основного
            r[i - mid] = n[i];
        }
        Sort(l); // рекурсивно разделяет левый подмассив
        Sort(r); // рекурсивно разделает правый подмассив

        return merge(n, l, r); // сливает два подмассива
    }

    private static int[] merge(Student n, int[] l, int[] r) {
        int i = 0, j = 0, k = 0;
        // пока не дойдем до конца l или r, выбрать наименьший элемент из l[i] и r[j]
        // и поставить его на правильное место в основном массиве
        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                n[k++] = l[i++];
            }
            else { // элемент в левом подмассиве больше элемента в правом подмассиве
                n[k++] = r[j++];
            }
        }
        // если закончились элементы в одном из подмассивов, перенести оставшиеся элементы
        while (i < l.length) { // если остались элементы в левом подмассиве
            n[k++] = l[i++];
        }
        while (j < r.length) { // если остались элементы в правом подмассиве
            n[k++] = r[j++];
        }
        return n;
    }
}
