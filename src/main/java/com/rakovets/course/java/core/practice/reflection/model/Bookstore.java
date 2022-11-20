package com.rakovets.course.java.core.practice.reflection.model;

public class Bookstore {
    private final int DISCOUNT = 15;

    private String bookTitle;
    private String genre;
    public double price;
    private int publicationYear;

    public Bookstore(String bookTitle, String genre, double price, int publicationYear) {
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    private String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
