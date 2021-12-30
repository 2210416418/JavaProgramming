package com.company;

public class Novel extends Book{

    public Novel(String title, int numberOfPages, int noOfChapters, String primaryCharacters) {
        super(title, numberOfPages, noOfChapters, primaryCharacters);
    }

    @Override
    public String bookReview(String bookReview) {
        return super.bookReview(bookReview);
    }
}
