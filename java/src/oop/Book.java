package oop;

public class Book extends Medium {
    private final String author;
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public void read(){
        System.out.println("reading...");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("This medium is a book! Author: " + author);
    }


}
