package ru.mirea.task20;

import java.util.Date;
import java.util.Scanner;

public class GetTimeOrDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        Date d1 = new Date();
        int x = 1;

        System.out.println("Тестирование программы, которая выводит текущую дату и время по запросу пользователя.");
        System.out.println("Запросы вводятся по английски строчными буквами (date, time).");
        System.out.println("Для завершения работы ввести '00'.\n");

        while (x != 0) {
            System.out.println("Введите команду: ");
            s = sc.next();
            switch (s){
                case "time":
                    System.out.println("Текущее время: " + d1.getHours() + ":" + d1.getMinutes() + "\n");
                    break;
                case "date":
                    System.out.println("Полная дата и время: " + d1 + "\n");
                    break;
                case "00":
                    System.out.println("Завершение работы.\n");
                    x = 0;
                    break;
                default:
                    System.out.println("Ошибка при вводе команды!\n");
                    break;
            }
        }
    }
}
