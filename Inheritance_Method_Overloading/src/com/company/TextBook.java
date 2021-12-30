package com.company;

public class TextBook extends Book{

    public TextBook(String title, int numberOfPages, int noOfChapters, String primaryCharacters) {
        super(title, numberOfPages, noOfChapters, primaryCharacters);
    }

    @Override
    public String bookReview(String bookReview) {
        return super.bookReview(bookReview);
    }
}
