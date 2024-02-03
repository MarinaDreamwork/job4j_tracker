package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 856);
        Book bookTwo = new Book("Little prince", 53);
        Book bookThree = new Book("Fairy tales", 356);
        Book bookFour = new Book("Java for Professionals", 1365);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Changing books with indexes 0 anf 3");
        Book helper = books[0];
        books[0] = books[3];
        books[3] = helper;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        for (Book book : books) {
            if (Objects.equals(book.getName(), "Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
