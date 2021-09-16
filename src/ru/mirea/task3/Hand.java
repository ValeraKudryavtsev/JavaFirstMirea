package ru.mirea.task3;

public class Hand {
    private boolean injury;
    private int handLength;
    private int bicepsSize;

    public Hand(boolean injury, int handLength, int bicepsSize) {
        this.injury = injury;
        this.handLength = handLength;
        this.bicepsSize = bicepsSize;
    }

    public Hand(boolean injury, int handLength) {
        this.injury = injury;
        this.handLength = handLength;
        bicepsSize = 0;
    }

    public Hand(boolean injury) {
        this.injury = injury;
        handLength = 0;
        bicepsSize = 0;
    }

    public Hand() {
        injury = false;
        handLength = 0;
        bicepsSize = 0;
    }

    public void setBicepsSize(int bicepsSize) {
        this.bicepsSize = bicepsSize;
    }

    public void setHandLength(int handLength) {
        this.handLength = handLength;
    }

    public void setInjury(boolean injury) {
        this.injury = injury;
    }

    public int getBicepsSize() {
        return bicepsSize;
    }

    public int getHandLength() {
        return handLength;
    }

    public boolean isInjury() {
        return injury;
    }
}
