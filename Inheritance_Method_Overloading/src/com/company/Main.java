package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ReadingClub njit = new ReadingClub();
        njit.welcome();

        ReadingMaterial material = new ReadingMaterial();
        material.materialsAvailable();

        Book book1 = new Book("Fire & Ice",1024,10,"Danerys, Khal Drogo");
        System.out.println("Title - " + book1.getTitle());
        System.out.println("No of Chapters - " + book1.getNoOfChapters());
        System.out.println("No of pages - " + book1.getNumberOfPages());
        System.out.println("Primary Characters" + book1.getPrimaryCharacters());
        System.out.println("Review - " + book1.bookReview("Amazing\n"));

        Book book2 = new Novel("Dance of dragons", 1000,24,"Alice");
        System.out.println("Title - " + book2.getTitle());
        System.out.println("No of Chapters - " + book2.getNoOfChapters());
        System.out.println("No of pages - " + book2.getNumberOfPages());
        System.out.println("Primary Characters" + book2.getPrimaryCharacters());
        System.out.println("Review - " + book2.bookReview("Lovely\n"));

        Book book3 = new TextBook("Java Programming",975,15,"Classes, Methods," +
                "Constructors, abstraction, encapsulation, inheritance, and polymorphism");
        System.out.println("Title - " + book3.getTitle());
        System.out.println("No of Chapters - " + book3.getNoOfChapters());
        System.out.println("No of pages - " + book3.getNumberOfPages());
        System.out.println("Primary Characters" + book3.getPrimaryCharacters());
        System.out.println("Review - " + book3.bookReview("Amazing to learn programming\n"));

        Magazine magazine = new Magazine("Mens Health", 90);
        System.out.println("Title - " + magazine.getMagazineTitle());
        System.out.println("No of pages - " + magazine.getTotalPages());
        System.out.println("About Magazine - " + "Learn about fitness\n");

        Magazine magazine1 = new Magazine("Auto Car", 90);
        System.out.println("Title - " + magazine1.getMagazineTitle());
        System.out.println("No of pages - " + magazine1.getTotalPages());
        System.out.println("About Magazine - " + "Learn about cars\n");

    }
}
