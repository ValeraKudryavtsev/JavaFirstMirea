package ru.mirea.task5;

public abstract class Dish {
    private int amount;
    private boolean fullKit;

    public Dish(int amount, boolean fullKit) {
        this.amount = amount;
        this.fullKit = fullKit;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isFullKit() {
        return fullKit;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setFullKit(boolean fullKit) {
        this.fullKit = fullKit;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "amount=" + amount +
                ", fullKit=" + fullKit +
                '}';
    }
}
