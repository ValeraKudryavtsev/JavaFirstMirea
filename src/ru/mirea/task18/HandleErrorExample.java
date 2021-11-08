package ru.mirea.task18;

public class HandleErrorExample {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i=0; i<10; i++)
            a[i] = i;
        for(int i=0; i<7; i++) {
            try {
                a[i] /= i;
            } catch (Exception e) {
                System.out.print("Ошибка при i = " + i + "; a[i] = 100\n");
                a[i] = 100;
            }
        }
        for(int i=0; i<a.length; i++)
            System.out.print("[" + a[i] + "] ");
    }
}
