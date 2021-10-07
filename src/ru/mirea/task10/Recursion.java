package ru.mirea.task10;

import java.util.Scanner;

public class Recursion {
    public void countNumOne(int cnt) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        x = sc.nextInt();
        if(x == 0) {
            System.out.println(cnt);
            return;
        }
        else if(x == 1) {
            cnt++;
            this.countNumOne(cnt);
        }
        else {
            this.countNumOne(cnt);
        }
    }

    public void outNotEven() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        x = sc.nextInt();
        if(x == 0)
            return;
        else if(x%2 == 1) {
            System.out.println(x);
            this.outNotEven();
        }
        else
            this.outNotEven();
    }

    public void outNotEvenNumber(int i) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        x = sc.nextInt();
        if(x == 0)
            return;
        else if(i%2 == 1){
            System.out.println(x);
            i++;
            this.outNotEvenNumber(i);
        }
        else {
            i++;
            this.outNotEvenNumber(i);
        }
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();

        System.out.println("\nУпражнение 11.\n");
        System.out.println("Введите последовательность чисел: ");
        r.countNumOne(0);

        System.out.println("\nУпражнение 12.\n");
        System.out.println("Введите последовательность чисел: ");
        r.outNotEven();

        System.out.println("\nУпражнение 13.\n");
        System.out.println("Введите последовательность чисел: ");
        r.outNotEvenNumber(0);
    }
}
