package com.itteros.tasks.library;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Отобразить все книги");
            System.out.println("0. Выйти");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();

                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();

                    System.out.print("Введите год издания книги: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера после nextInt()

                    Book newBook = new Book(title, author, year);
                    library.addBook(newBook);
                    break;
                case 2:
                    library.displayAllBooks();
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
