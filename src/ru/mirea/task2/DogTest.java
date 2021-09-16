package ru.mirea.task2;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bob", 7);
        Dog d2 = new Dog("Rocket");
        Dog d3 = new Dog("Dave", 3);

        d2.setAgeDog(5);
        System.out.println(d1);
        d1.toHumanAge();
        d2.toHumanAge();
        d3.toHumanAge();
    }
}
