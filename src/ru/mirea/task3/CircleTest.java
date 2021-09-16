package ru.mirea.task3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, d;

        System.out.println("Введите радиус и диаметр, соблюдая правила (d = 2r): ");
        r = sc.nextDouble();
        d = sc.nextDouble();
        Circle c1 = new Circle(r, d);
        System.out.println("Радиус = "+ c1.getR() +" Диаметр = "+ c1.getD() +" Площадь = "+ c1.getS() +" Длина окружности = "+ c1.getC());

        System.out.println("Введите радиус: ");
        r = sc.nextDouble();
        Circle c2 = new Circle(r);
        System.out.println("Радиус = "+ c2.getR() +" Диаметр = "+ c2.getD() +" Площадь = "+ c2.getS() +" Длина окружности = "+ c2.getC());

        Circle c3 = new Circle();
        System.out.println("Введите радиус: ");
        r = sc.nextDouble();
        c3.setR(r);
        System.out.println("Радиус = "+ c3.getR() +" Диаметр = "+ c3.getD() +" Площадь = "+ c3.getS() +" Длина окружности = "+ c3.getC());
    }
}
