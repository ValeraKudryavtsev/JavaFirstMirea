package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Stories", 730);
        Book b2 = new Book("Poems");
        Book b3 = new Book();

        b2.setCntBook(320);
        b3.setNameBook("Novels");
        b3.setCntBook(459);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
