package ru.mirea.task5;

public class Plate extends Dish {
    private String name;

    public Plate(int amount, boolean fullKit, String name) {
        super(amount, fullKit);
        this.name = name;
    }

    public void washPlate() {
        System.out.println("Тарелки помыты");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
