package ru.mirea.task6;

public class NameTest {
    public static void main(String[] args) {
        Nameable test1 = new Name1("Тест интерфейса 1");
        Nameable test2 = new Name2("Тест интерфейса 2");

        System.out.println(test1.getName());
        System.out.println(test2.getName());
    }
}
