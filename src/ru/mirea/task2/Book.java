package ru.mirea.task2;

public class Book {
    private String name;
    private int cntPages;

    public Book(String name, int cntPages) {
        this.name = name;
        this.cntPages = cntPages;
    }

    public Book(String name) {
        this.name = name;
        this.cntPages = 0;
    }

    public Book() {
        this.name = "NoName";
        this.cntPages = 0;
    }

    public String getNameBook() {
        return name;
    }

    public int getCntBook() {
        return cntPages;
    }

    public void setNameBook(String name) {
        this.name = name;
    }

    public void setCntBook(int cntPages) {
        this.cntPages = cntPages;
    }

    public String toString() {
        return this.name+", count of pages: "+ this.cntPages;
    }

    public void readTime(int cntPages) {
        System.out.println("При чтении 20 страниц в час книга будет прочитана за "+ cntPages/20.0 +" часов.");
    }
}
