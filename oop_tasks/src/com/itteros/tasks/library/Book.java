package com.itteros.tasks.library;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
public class Book extends java.awt.print.Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author + " (" + year + ")";
    }
}
