package ru.mirea.task13;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<String>();
        System.out.println(firstList);
        System.out.println("Добавление элемента в конец");
        firstList.add("ghf");
        System.out.println(firstList);
        firstList.add("hgf");
        System.out.println(firstList);
        System.out.println("Добавление элемента в середину");
        firstList.add(1, "shagf");
        System.out.println(firstList);
        System.out.println("Вывод конкретного элемента");
        System.out.println(firstList.get(0));
        System.out.println("Удаление элемента по номеру");
        firstList.remove(2);
        System.out.println(firstList);
        System.out.println("Удаление элемента по содержимому");
        firstList.remove("ghf");
        System.out.println(firstList);
        System.out.println("Вывод размера списка");
        System.out.println(firstList.size());
    }
}
