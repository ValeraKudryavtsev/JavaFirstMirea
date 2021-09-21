package ru.mirea.task6;

public class Price1 implements Priceable {
    private int price;

    public Price1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Price1{" +
                "price=" + price +
                '}';
    }
}
