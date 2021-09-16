package ru.mirea.task2;

public class Ball {
    private String name;
    private int cntBall;

    public Ball(String name, int cntBall) {
        this.name = name;
        this.cntBall = cntBall;
    }

    public Ball(String name) {
        this.name = name;
        this.cntBall = 0;
    }

    public Ball() {
        this.name = "NoName";
        this.cntBall = 0;
    }

    public String getNameBall() {
        return name;
    }

    public int getCntBall() {
        return cntBall;
    }

    public void setNameBall(String name) {
        this.name = name;
    }

    public void setCntBall(int cntBall) {
        this.cntBall = cntBall;
    }

    public String toString() {
        return this.name+", count of balls: "+ this.cntBall;
    }
}
