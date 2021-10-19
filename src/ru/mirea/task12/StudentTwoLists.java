package ru.mirea.task12;

import java.util.Arrays;

public class StudentTwoLists {
    public void mergeSort(int[] a, int left, int right) {
        if (right <= left)
            return;
        int mid = left + (right - left) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = left; k <= right; k++)
            buf[k] = a[k];

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > right) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}
