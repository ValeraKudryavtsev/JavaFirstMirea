package ru.mirea.task5;

public class DogTest {
    public static void main(String[] args) {
        Beagle b1 = new Beagle("Beagle", "Dave");
        Labrador l1 = new Labrador("Labrador", "Rocket");

        System.out.println(b1);
        System.out.println(l1);
        System.out.println("Порода 1: " + b1.getKind());
        System.out.println("Порода 2: " + l1.getKind());
        System.out.println(b1.getName());
        System.out.println(l1.getName());
    }
}
