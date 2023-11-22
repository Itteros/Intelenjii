package com.itteros.tasks.library;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга успешно добавлена в библиотеку.");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Список книг в библиотеке:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
