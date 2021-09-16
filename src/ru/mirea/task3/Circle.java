package ru.mirea.task3;

import java.lang.Math;

public class Circle {
    private double r;
    private double d;
    private double S;
    private double C;

    public Circle(double r, double d) {
        this.r = r;
        this.d = d;
    }

    public Circle(double r) {
        this.r = r;
        this.d = r*2;
    }

    public Circle() {
        this.r = 0;
        this.d = 0;
    }

    public void setR(double r) {
        this.r = r;
        this.d = r*2;
    }

    public double getR() {
        return r;
    }

    public double getD() {
        return d;
    }

    public double getS() {
        return (Math.PI*r*r);
    }

    public double getC() {
        return (Math.PI*2*r);
    }
}
