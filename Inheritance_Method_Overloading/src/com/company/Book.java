package com.company;

public class Book {
    private String title;
    private int numberOfPages;
    private int noOfChapters;
    private String primaryCharacters;

    public Book(String title,int numberOfPages, int noOfChapters, String primaryCharacters) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.noOfChapters = noOfChapters;
        this.primaryCharacters = primaryCharacters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNoOfChapters() {
        return noOfChapters;
    }

    public void setNoOfChapters(int noOfChapters) {
        this.noOfChapters = noOfChapters;
    }

    public String getPrimaryCharacters() {
        return primaryCharacters;
    }

    public void setPrimaryCharacters(String primaryCharacters) {
        this.primaryCharacters = primaryCharacters;
    }

    public String bookReview(String bookReview){
        return bookReview;
    }
}
