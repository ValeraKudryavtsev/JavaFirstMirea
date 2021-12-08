package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BankSystemBase {
    public static void main(String[] args) {
        HashMap<Integer, String> customersHashMap = new HashMap<>();

        customersHashMap.put(1, "Иванов");
        customersHashMap.put(2, "Петров");
        customersHashMap.put(3, "Сидоров");
        customersHashMap.put(4, "Попов");
        customersHashMap.put(5, "Медведев");
        customersHashMap.put(6, "Потапов");
        System.out.println("Список:");
        System.out.println(customersHashMap);

        customersHashMap.put(4, "Белый");
        //намеренно добавляем клиента с повторным ключом
        System.out.println("\nОбновленный список:");
        System.out.println(customersHashMap);

        String artist3Name = customersHashMap.get(3);
        System.out.println("\n3 в списке:");
        System.out.println(artist3Name);

        customersHashMap.remove(4);
        //удаляем четвертого
        System.out.println("\nОбновленный список:");
        System.out.println(customersHashMap);

        ArrayList<String> values = new ArrayList<>(customersHashMap.values());
        System.out.println("\nФамилии: " + values);

        Set<Integer> keys = customersHashMap.keySet();
        System.out.println("\nУникальные номера: " + keys);

        System.out.println();
        for (Map.Entry entry: customersHashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
