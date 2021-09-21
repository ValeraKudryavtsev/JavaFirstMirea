package ru.mirea.task5;

public abstract class Dog {
    private String kind;

    public Dog(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                '}';
    }
}
