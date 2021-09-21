package ru.mirea.task5;

public class Chair extends Furniture{
    private int amount;
    private int price;

    public Chair(String name, int amount, int price) {
        super(name);
        this.amount = amount;
        this.price = price;
    }

    public void buyChair(int n) {
        amount-= n;
        System.out.println("Кресел продано: " + n);
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "amount=" + amount +
                ", price=" + price +
                '}';
    }
}
