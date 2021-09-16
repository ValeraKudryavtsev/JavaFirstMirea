package ru.mirea.task1;

public class Var4 {
    private int[] a;

    public Var4(int i) {
        a = new int[i];
    }

    public void getRandomArray() {
        for(int j=0;j<a.length;j++) {
            a[j] = (int) (Math.random() * 100);
        }
    }

    public void sortArray() {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;
                }
            }
        }
    }

    public void printArray() {
        for (int j=0;j<a.length;j++) {
            System.out.println(a[j]);
        }
    }
}
