package ru.mirea.task12;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        int[] iDNumber = {12, 5, 32, 4, 3, 43, 2, 1};
        Student s = new Student(iDNumber);
        System.out.println(s.toString());
        s.insertionSort();
        System.out.println(s.toString() + "\n");

        Comparator c1 = new SortingStudentByGPA();
        int[] array = {98, 73, 87, 78, 94, 96, 92, 88, 82, 76};
        System.out.println(Arrays.toString(array));
        c1.quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array) + "\n");

        int[] x = {98, 73, 87, 78, 94, 96, 92, 88, 82, 76};
        int[] y = {66, 76, 94, 81, 79, 69, 75, 67, 85, 86};
        int i = x.length + y.length;
        int[] both = new int[i];
        for(i=0; i<x.length; i++)
            both[i] = x[i];
        int j = 0;
        while(i<both.length) {
            both[i] = y[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(both));
        StudentTwoLists ss = new StudentTwoLists();
        ss.mergeSort(both, 0, both.length-1);
        System.out.println(Arrays.toString(both));
    }
}
