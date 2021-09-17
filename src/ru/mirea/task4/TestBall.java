package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(2.3,4.5);
        Ball ball2 = new Ball(4.1, 5.7);
        Ball ball3 = new Ball();

        ball1.setX(3.2);
        ball2.setY(4.1);
        ball3.setXY(1.2, 3.4);
        ball1.move(1.2, 3.4);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
