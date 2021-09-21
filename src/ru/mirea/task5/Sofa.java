package ru.mirea.task5;

public class Sofa extends Furniture{
    private int amount;
    private int price;

    public Sofa(String name, int amount, int price) {
        super(name);
        this.amount = amount;
        this.price = price;
    }

    public void buySofa(int n) {
        amount-= n;
        System.out.println("Диванов продано: " + n);
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
        return "Sofa{" +
                "amount=" + amount +
                ", price=" + price +
                '}';
    }
}
