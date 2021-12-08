package ru.mirea.task25;

public class BankSystemTest {
    public static void main(String[] args) {
        Service s1;
        Service s2;
        int price01 = 1000;
        int price02 = 3000;

        s1 = new Credit(price01);
        System.out.println("Test 1");
        System.out.println(s1.toString() + "\n");

        s2 = new Loan(price02);
        System.out.println("Test 2");
        System.out.println(s2.toString());
    }
}
