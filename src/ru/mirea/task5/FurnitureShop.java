package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args) {
        Chair ch = new Chair("Кресло", 23, 5000);
        Sofa s = new Sofa("Диван", 15, 15000);

        s.setPrice(14900);
        ch.setAmount(21);
        s.buySofa(3);
        System.out.println("Диванов осталось: " + s.getAmount());
        ch.buyChair(1);
        System.out.println("Кресел осталось: " + ch.getAmount());
        System.out.println("Информация по наличию диванов.\n" + s);
        System.out.println("Информация по наличию кресел.\n" + ch);
    }
}
