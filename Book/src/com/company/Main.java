package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

            TreeSet<Book> books=new TreeSet<Book>();
            books.add(new Book("Три товарища", "Эрих Мария Ремарк", 1000));
            books.add(new Book("Бессонница", "Стивен Кинг", 200));
            books.add(new Book("Сияние", "Стивен Кинг", 300));
            books.add(new Book("Лед и пламя", "Рей Брэдбери", 422));
            books.add(new Book("Трудно быть богом", "Стругацкие", 700));
            books.add(new Book("Солярис", "Лем Станислав", 666));
            books.add(new Book("Дом в котором...", "Мариам Петросян", 228));
            for(Book i: books){
                System.out.println(i.toString());
            }
        }
    }

