package ru.mirea.task5;

public class Cup extends Dish {
    private String name;

    public Cup(int amount, boolean fullKit, String name) {
        super(amount, fullKit);
        this.name = name;
    }

    public void washCup() {
        System.out.println("Чашки помыты");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}