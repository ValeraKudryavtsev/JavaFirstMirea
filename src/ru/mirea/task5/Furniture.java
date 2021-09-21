package ru.mirea.task5;

public abstract class Furniture {
    private String name;

    public Furniture(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
