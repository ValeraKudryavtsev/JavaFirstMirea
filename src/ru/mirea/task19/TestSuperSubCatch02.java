package ru.mirea.task19;

public class TestSuperSubCatch02 {
    public static void main(String[] args) {
        int[] a = {1};
        try {
            a[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Пробуем перехватить исключение конкретного класса: \n" + e);
        } catch (Exception e) {
            //это не сработает, так как исключение уже было перехвачено
            System.out.println("Пробуем перехватить исключение общего класса: \n" + e);
        }
    }
}
