package ru.mirea.task3;

public class Leg {
    private boolean injury;
    private int legLength;
    private int legSize;

    public Leg(boolean injury, int legLength, int legSize) {
        this.injury = injury;
        this.legLength = legLength;
        this.legSize = legSize;
    }

    public Leg(boolean injury, int legLength) {
        this.injury = injury;
        this.legLength = legLength;
        legSize = 0;
    }

    public Leg(boolean injury) {
        this.injury = injury;
        legLength = 0;
        legSize = 0;
    }

    public Leg() {
        injury = false;
        legLength = 0;
        legSize = 0;
    }

    public void setInjury(boolean injury) {
        this.injury = injury;
    }

    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    public void setLegSize(int legSize) {
        this.legSize = legSize;
    }

    public boolean isInjury() {
        return injury;
    }

    public int getLegLength() {
        return legLength;
    }

    public int getLegSize() {
        return legSize;
    }
}
