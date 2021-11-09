package ru.mirea.task19;

public class ReturnTest {
    public static String returnTest01() {
        try {
            return "Не должно сработать!";
        } catch (Exception e) {
            return "Вроде тоже мимо!";
        } finally {
            return "А вот это сработает!";
        }
    }

    public static String returnTest02() {
        try {
            return "А здесь вот это верно!";
        } catch (Exception e) {
            return "Здесь снова мимо!";
        }
    }

    public static void main(String[] args) {
        System.out.println("Проведем тест с оператором return для закрепления.\n");
        System.out.println(returnTest01() + "\n");
        System.out.println(returnTest02() + "\n");
    }
}
