package ru.mirea.task25;

public class Credit implements Service{
    public int price;

    public Credit(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "price=" + price +
                '}';
    }
}
