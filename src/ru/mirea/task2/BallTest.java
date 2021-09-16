package ru.mirea.task2;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("Football", 7);
        Ball b2 = new Ball("Basketball");
        Ball b3 = new Ball();

        b2.setCntBall(20);
        b3.setNameBall("Volleyball");
        b3.setCntBall(45);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
