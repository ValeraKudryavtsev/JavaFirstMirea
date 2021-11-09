package ru.mirea.task19;

public class TestSuperSubCatch01 {
    public static void main(String[] args) {
        int[] a = {1};
        try {
            a[10] = 10;
        } catch (Exception e) {
            System.out.println("Пробуем перехватить исключение общего класса: \n" + e);
        }
    }
}
