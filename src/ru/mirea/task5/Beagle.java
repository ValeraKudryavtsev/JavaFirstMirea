package ru.mirea.task5;

public class Beagle extends Dog{
    private String name;

    public Beagle(String kind, String name) {
        super(kind);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
