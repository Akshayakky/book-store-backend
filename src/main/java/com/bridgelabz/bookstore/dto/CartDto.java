package com.bridgelabz.bookstore.dto;

public class CartDto {
    private String bookTitle;
    private int bookId;
    private int bookQuantity;
    private double bookPrice;


    public CartDto(int bookId, int bookQuantity, double bookPrice) {
        this.bookId = bookId;
        this.bookQuantity = bookQuantity;
        this.bookPrice = bookPrice;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}