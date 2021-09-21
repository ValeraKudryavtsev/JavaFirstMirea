package ru.mirea.task6;

public class PriceTest {
    public static void main(String[] args) {
        Priceable test1 = new Price1(123);
        Priceable test2 = new Price2(321);

        System.out.println(test1);
        System.out.println(test2);
    }
}
