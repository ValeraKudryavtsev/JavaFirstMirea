package ru.mirea.task6;

public class Price2 implements Priceable {
    private int price;

    public Price2(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Price2{" +
                "price=" + price +
                '}';
    }
}
