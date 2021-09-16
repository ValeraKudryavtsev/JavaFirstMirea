package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog() {
        this.name = "NoName";
        this.age = 0;
    }

    public String getNameDog() {
        return name;
    }

    public int getAgeDog() {
        return age;
    }

    public void setNameDog(String name) {
        this.name = name;
    }

    public void setAgeDog(int age) {
        this.age = age;
    }

    public String toString() {
        return this.name+", age: "+ this.age;
    }

    public void toHumanAge() {
        System.out.println(name+" is "+ age*7 +"y.o. in human age.");
    }
}
