package ru.mirea.task12;

public class SortingStudentByGPA implements Comparator{
    @Override
    public void quickSort(int[] array, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int temp = array[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент больше, чем temp
            while (array[leftMarker] > temp) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент меньше, чем temp
            while (array[rightMarker] < temp) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int buf = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = buf;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < right) {
            quickSort(array, leftMarker, right);
        }
        if (left < rightMarker) {
            quickSort(array, left, rightMarker);
        }
    }
}
