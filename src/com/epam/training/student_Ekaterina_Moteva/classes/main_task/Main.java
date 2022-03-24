package com.epam.training.student_Ekaterina_Moteva.classes.main_task;

public class Main {

    public static void main(String[] args) {
        Book[] books = {new Book(1, "Wuthering Heights", "Emily Bronte", "First", 1847),
                new Book(2, "War and peace", "Leo Tolstoy", "First", 1869),
                new Book(3, "Pride and Prejudice", "Jane Austen", "First", 1813),
                new Book(4, "Anna Karenina", "Leo Tolstoy", "Second", 1877),
                new Book(5, "Emma", "Jane Austen", "Second", 1815),
                new Book(6, "Les Misérables", "Victor Hugo", "Second", 1862),
                new Book(7, "Cathedral of Notre Dame", "Victor Hugo", "Second", 1831),
                new Book(8, "Dubrovsky", "Alexander Pushkin", "Third", 1833),
                new Book(9, "Eugene Onegin", "Alexander Pushkin", "Third", 1837),
                new Book(10, "Belkin's Tales", "Alexander Pushkin", "Third", 1831)};

        System.out.println("Selection by author:");
        for (int i = 0; i < books.length; i++){
            if (books[i].getAuthor().equals("Alexander Pushkin")){
                System.out.println(books[i].toString());
            }
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        System.out.println("Selection by publishing:");
        for (int i = 0; i < books.length; i++){
            if (books[i].getPublishing().equals("First")){
                System.out.println(books[i].toString());
            }
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        System.out.println("Selection by year:");
        for (int i = 0; i < books.length; i++){
            if (books[i].getYear()>1840){
                System.out.println(books[i].toString());
            }
        }
    }
}
