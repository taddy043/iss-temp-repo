package com.company;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    private static void print(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.print(books.get(i).getName() + "; " + books.get(i).getAuthor() + "; " + books.get(i).getPages() + "\n");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Три товарища", "Эрих Мария Ремарк", 1000));
        books.add(new Book("Бессонница", "Стивен Кинг", 200));
        books.add(new Book("Сияние", "Стивен Кинг", 300));
        books.add(new Book("Лед и пламя", "Рей Брэдбери", 422));
        books.add(new Book("Трудно быть богом", "Стругацкие", 700));
        books.add(new Book("Солярис", "Лем Станислав", 666));
        books.add(new Book("Дом в котором...", "Мариам Петросян", 228));

        System.out.println("Неотсортированный список книг:"); print(books);
        books.sort(new sortByName());
        System.out.println("Список книг, отсортированный по названиям:"); print(books);
        books.sort(new sortByAuthor());
        System.out.println("Список книг, отсортированный по авторам:"); print(books);
        books.sort(new sortByPages());
        System.out.println("Список книг, отсортированный по страницам:"); print(books);
    }

    static class sortByName implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Book book1 = (Book) o1;
            Book book2 = (Book) o2;
            if (book1.getName().compareTo(book2.getName())>0) return 1;
            else if (book1.getName().compareTo(book2.getName())<0) return -1;
            else return 0;
        }
    }
    static class sortByAuthor implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Book book1 = (Book) o1;
            Book book2 = (Book) o2;
            if (book1.getAuthor().compareTo(book2.getAuthor())>0) return 1;
            else if (book1.getAuthor().compareTo(book2.getAuthor())<0) return -1;
            else return 0;
        }
    }
    static class sortByPages implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Book book1 = (Book) o1;
            Book book2 = (Book) o2;
            if (book1.getPages()>book2.getPages()) return 1;
            else if (book1.getPages()<book2.getPages()) return -1;
            else return 0;
        }
    }
    }
}
