package ru.mirea.task3;

public class Head {
    private boolean injury;
    private int headSize;

    public Head(boolean injury, int headSize) {
        this.injury = injury;
        this.headSize = headSize;
    }

    public Head(boolean injury) {
        this.injury = injury;
        headSize = 0;
    }

    public Head(int headSize) {
        this.headSize = headSize;
        injury = false;
    }

    public Head() {
        injury = false;
        headSize = 0;
    }

    public void setInjury(boolean injury) {
        this.injury = injury;
    }

    public void setHeadSize(int headSize) {
        this.headSize = headSize;
    }

    public boolean isInjury() {
        return injury;
    }

    public int getHeadSize() {
        return headSize;
    }
}
