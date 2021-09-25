package ru.mirea.task7;

public class MoveTest {
    public static void main(String[] args) {
        Movable c1 = new MovableCircle(0, 0, 6, 5, 10);
        c1.moveDown();
        c1.moveLeft();
        System.out.println(c1 + "\n");

        Movable c2 = new MovableCircle(2, 3, 10, 3, 5);
        c2.moveUp();
        c2.moveRight();
        System.out.println(c2 + "\n");

        Movable r1 = new MovableRectangle(1, 6, 5, 0, 3, 4);
        r1.moveUp();
        r1.moveRight();
        System.out.println(r1 + "\n");

        Movable r2 = new MovableRectangle(0, 6, 0, -8, 10, 10);
        r2.moveDown();
        r2.moveLeft();
        System.out.println(r2 + "\n");

        System.out.println("Конец работы\n");
    }
}
