package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Oleg", "sdgshjhdg@gmail.com", 'm');
        Author author2 = new Author("Edik", "hjsdgjh@mail.ru", 'm');
        Author author3 = new Author("Alena", "hdjsgj@icloud.com", 'f');

        author1.setEmail("hdgdhsg@gmail.com");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
    }
}
