package com.github.MaxWilmes1.ObjectOrientation.Package_2.Challange.Solution1;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public Library addBook(Book book){
        // Neues Array mit zusätzlichem Platz für das neue Buch und Inhalt des originals
        Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);

        // Neues Buch wird an den letzen Platz angehangen
        newBooks[newBooks.length - 1] = book;

        //Neue Library mit aktualisiertem Bücherbestand zurückgeben
        Library NewLibrary = new Library(newBooks);
        return NewLibrary;
    }

    public Library removeBook(Book book){
        Book[] newBooks = new Book[books.length - 1];

        int newIndexOfBook = 0; // Wird benötigt, da in der neuen Library sonst ein Platz mit dem gelöschtem Buch leer bleibt
        for (int i = 0; i < books.length; i++){
            if (books[i].equals(book)){
                continue;
            } else {
                newBooks[newIndexOfBook] = books[i];
                newIndexOfBook++;
            }
        }

        //Neue Library mit aktualisiertem Bücherbestand zurückgeben
        Library NewLibrary = new Library(newBooks);
        return NewLibrary;
    }
}
