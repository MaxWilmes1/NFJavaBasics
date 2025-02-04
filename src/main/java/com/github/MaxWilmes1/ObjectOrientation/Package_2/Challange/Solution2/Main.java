package com.github.MaxWilmes1.ObjectOrientation.Package_2.Challange.Solution2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "ISBN12345678");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "ISBN1234567");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN123456");
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN12345");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);  // Jetzt können wir ein viertes Buch hinzufügen!

        System.out.println(library);  // Gibt alle Bücher aus
    }
}

