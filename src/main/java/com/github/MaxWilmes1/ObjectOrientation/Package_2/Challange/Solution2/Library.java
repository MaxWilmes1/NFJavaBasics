package com.github.MaxWilmes1.ObjectOrientation.Package_2.Challange.Solution2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> library;  // Liste für beliebig viele Bücher

    public Library() {
        this.library = new ArrayList<>();
    }

    public void addBook(Book book) {
        library.add(book);
    }

    public List<Book> getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + library + '}';
    }
}
