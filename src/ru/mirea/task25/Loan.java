package ru.mirea.task25;

public class Loan implements Service {
    public int price;

    public Loan(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "price=" + price +
                '}';
    }
}
