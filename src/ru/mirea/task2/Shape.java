package ru.mirea.task2;

public class Shape {
    private String shapeName;
    private int shapeArea;

    public Shape(String shapeName, int shapeArea) {
        this.shapeName = shapeName;
        this.shapeArea = shapeArea;
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
        shapeArea = 0;
    }

    public Shape(int shapeArea) {
        shapeName = "NoName";
        this.shapeArea = shapeArea;
    }

    public Shape() {
        shapeName = "NoName";
        shapeArea = 0;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public void setShapeArea(int shapeArea) {
        this.shapeArea = shapeArea;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getShapeArea() {
        return shapeArea;
    }

    public String toString() {
        return this.shapeName+", area: "+ this.shapeArea;
    }
}
