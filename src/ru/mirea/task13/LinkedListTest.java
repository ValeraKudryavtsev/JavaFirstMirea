package ru.mirea.task13;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> secondList = new LinkedList<String>();
        System.out.println(secondList);
        System.out.println("Добавление элемента в конец");
        secondList.add("123");
        System.out.println(secondList);
        secondList.add("321");
        secondList.add("456");
        secondList.add("654");
        System.out.println(secondList);
        System.out.println("Добавление элемента в середину");
        secondList.add(2, "555");
        System.out.println(secondList);
        System.out.println("Удаление элемента по содержимому");
        secondList.remove("555");
        System.out.println(secondList);
        System.out.println("Вывод размера списка");
        System.out.println(secondList.size());
    }
}
