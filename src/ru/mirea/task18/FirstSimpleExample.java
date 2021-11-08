package ru.mirea.task18;

public class FirstSimpleExample {
    public static void main(String[] args) {
        System.out.println("Простой пример с делением на 0 для закрепления.\n");

        int a, b;

        try {
            a = 0;
            b = 35/a;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка!\nИсключение сработало!\n");
        }

        System.out.println("Текст после проверки работы исключения.");
    }
}
