package ru.mirea.task12;

import java.util.Arrays;

public class Student {
    private int[] a;

    public Student(int []a) {
        this.a = a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }

    public void insertionSort() {
        for(int left=0; left<a.length; left++) {
            int x = a[left];
            int i = left - 1;
            while (i >= 0) {
                if (x < a[i])
                    a[i + 1] = a[i];
                else
                    break;
                i--;
            }
            a[i+1] = x;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "a=" + Arrays.toString(a) +
                '}';
    }
}
