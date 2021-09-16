package ru.mirea.task2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Circle", 7);
        Shape shape2 = new Shape("Square");
        Shape shape3 = new Shape("Triangle", 3);
        Shape shape4 = new Shape();

        shape2.setShapeArea(5);
        System.out.println(shape1);
        shape4.setShapeArea(6);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
    }
}
