package ru.mirea.task5;

public class DishTest {
    public static void main(String[] args) {
        Cup c1 = new Cup(5, true, "Чашки");
        Plate p1 = new Plate(10, false, "Тарелки");

        System.out.println(c1);
        System.out.println(p1);
        System.out.println("Количество тарелок: " + p1.getAmount());
        System.out.println("Комплект чашек полон? " + c1.isFullKit());
        System.out.println(c1.getName());
        System.out.println(p1.getName());
        c1.washCup();
        p1.washPlate();
    }
}
