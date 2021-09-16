package ru.mirea.task1;

public class Var1 {
    private int i;
    private int[] a = new int[i];
    private int result;

    public Var1(int i, int[] a) {
        this.i = i;
        this.a = a;
    }

    public int getSumUsingFor() {
        result = 0;
        for(int j=0;j<i;j++) {
            this.result += a[j];
        }
        return result;
    }

    public int getSumUsingWhile() {
        result = 0;
        int j=0;
        while(j<i) {
            result += a[j];
            j++;
        }
        return result;
    }

    public int getSumUsingDoWhile() {
        result = 0;
        int j=0;
        do {
            result += a[j];
            j++;
        } while(j<i);
        return result;
    }
}
