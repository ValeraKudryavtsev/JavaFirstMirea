package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/valera_kudryavtsev/Documents/Учёба/2 курс/Java/file1.txt");
        Scanner sc = new Scanner(System.in);

        FileWriter writeIntoFile = new FileWriter(file);
        System.out.println("Запись в файл.");
        System.out.println("Введите информацию для записи в файл: ");
        String text = sc.next();
        writeIntoFile.write(text);
        writeIntoFile.close();

        System.out.println("\nЧтение информации из файла.");
        FileReader readFromFile = new FileReader(file);
        Scanner scan = new Scanner(readFromFile);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine() + "\n");
        }
        readFromFile.close();

        writeIntoFile = new FileWriter(file);
        System.out.println("Замена информации в файле.");
        System.out.println("Введите информацию для записи в файл: ");
        text = sc.next();
        writeIntoFile.write(text);
        writeIntoFile.close();
        System.out.println("Вывод результата: ");
        readFromFile = new FileReader(file);
        scan = new Scanner(readFromFile);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine() + "\n");
        }
        readFromFile.close();

        writeIntoFile = new FileWriter(file, true);
        System.out.println("Добавление записи в конец файла.");
        System.out.println("Введите информацию для записи в файл: ");
        text = sc.next();
        writeIntoFile.write(text);
        writeIntoFile.close();
        System.out.println("Повторный вывод результата: ");
        readFromFile = new FileReader(file);
        scan = new Scanner(readFromFile);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine() + "\n");
        }
        readFromFile.close();
    }
}
