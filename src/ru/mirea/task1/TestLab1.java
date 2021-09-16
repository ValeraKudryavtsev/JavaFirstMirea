package ru.mirea.task1;

import java.util.Scanner;

public class TestLab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Вариант 1.");
        System.out.println("Ввести количество чисел массива: ");//вывод на экран
        int i = sc.nextInt();//вводим числа
        int[] a = new int[i];//создаем массив
        System.out.println("Ввести значения чисел массива: ");
        for(int j=0;j<i;j++) {
            a[j] = sc.nextInt();//инициализируем массив
        }

        Var1 v1 = new Var1(i, a);
        System.out.println("Номер 1: "+v1.getSumUsingFor());
        System.out.println("Номер 2: "+v1.getSumUsingWhile());
        System.out.println("Номер 3: "+v1.getSumUsingDoWhile());

        System.out.println("\nВариант 2.");
        for (int j=0;j<args.length;j++) {
            System.out.println(args[j] + " ");
        }

        System.out.println("\nВариант 3.");
        Var3 v3 = new Var3();
        v3.getHarmonicSeries();

        System.out.println("\nВариант 4.");
        System.out.print("Ввести количество чисел массива: ");//вывод на экран
        i = sc.nextInt();//вводим числа
        Var4 v4 = new Var4(i);
        v4.getRandomArray();
        v4.printArray();
        System.out.print('\n');
        v4.sortArray();
        v4.printArray();

        System.out.println("\nВариант 5.");
        System.out.print("Введите число, факториал которого надо найти: ");
        int x = sc.nextInt();
        Var5 v5 = new Var5();
        System.out.println("Факториал " +x+ " = " +v5.getFactorial(x));
    }
}
