package ru.mirea.task7;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        //метод был переопределен, ошибок не будет
        System.out.println(s1.getArea()); // which version?
        /*метод был переопределен, ошибок не будет
        абстрактные методы, которые были объявлены в Shape вызываются без проблем,
        так как s1 - объект типа Shape
        */
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        //нельзя вызвать метод getRadius, так как он не является абстрактным методом класса Shape
        //System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        /*Shape s2 = new Shape();
        нельзя создавать объекты абстрактного класса, можно лишь приводить их к объектам подкласса,
        то есть делать апкаст*/

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        //ситуация аналогична той, что была выше
        //нельзя вызвать метод getLength, так как он не является абстрактным методом класса Shape
        //System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        //нельзя вызвать метод getSide, так как он не является абстрактным методом класса Shape
        //System.out.println(s4.getSide());

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //метод getSide не был определен в суперклассе
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
