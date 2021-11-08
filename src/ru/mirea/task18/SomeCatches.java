package ru.mirea.task18;

public class SomeCatches {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("a = " + a);
            int b = 10 / a;
            int[] m = {1};
            m[10] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на 0\n" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границу массива\n" + e);
        }
        System.out.println("\n//... код после ПЕРВОГО блока операторов try/catch\n\n");

        try {
            int a = 53;
            System.out.println("a = " + a);
            int b = 10 / a;
            int[] m = {1};
            m[10] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на 0\n" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границу массива\n" + e);
        }
        System.out.println("\n//... код после ВТОРОГО блока операторов try/catch");
    }
}
