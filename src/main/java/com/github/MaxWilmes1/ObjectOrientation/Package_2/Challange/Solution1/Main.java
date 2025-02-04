package com.github.MaxWilmes1.ObjectOrientation.Package_2.Challange.Solution1;

public class Main {

    public static void main(String[] args) {
        Book DerHerrDerRinge1 = new Book("Die Gefährten", "J.R.R Tolkien", "ISBN1234567");
        Book DerHerrDerRinge2 = new Book("Die zwei Türme", "J.R.R Tolkien", "ISBN1234568");
        Book DerHerrDerRinge3 = new Book("Die Rückkehr des Königs", "J.R.R Tolkien", "ISBN1234569");
        Book DerHerrDerRingeDerHobbit = new Book("Der Hobbit", "J.R.R Tolkien", "ISBN12345");

        Book[] books = {DerHerrDerRinge1, DerHerrDerRinge2, DerHerrDerRinge3};

        Library ScienceFictionLibrary = new Library(books);

        System.out.println(ScienceFictionLibrary);

//        System.out.println("-----reset all books in Library via setBooks method");
//
//        Book[] books2 = {DerHerrDerRinge1, DerHerrDerRinge2, DerHerrDerRinge3, DerHerrDerRingeDerHobbit};
//        ScienceFictionLibrary.setBooks(books2);
//        System.out.println(ScienceFictionLibrary);

        System.out.println("---------add new book via add Book method-----------");

        ScienceFictionLibrary = ScienceFictionLibrary.addBook(DerHerrDerRingeDerHobbit);

        System.out.println(ScienceFictionLibrary);

        System.out.println("---------remove a book via add Book method-----------");

        ScienceFictionLibrary = ScienceFictionLibrary.removeBook(DerHerrDerRinge1);

        System.out.println(ScienceFictionLibrary);

        System.out.println("---------remove another book via add Book method-----------");

        ScienceFictionLibrary = ScienceFictionLibrary.removeBook(DerHerrDerRinge2);

        System.out.println(ScienceFictionLibrary);
    }

}
