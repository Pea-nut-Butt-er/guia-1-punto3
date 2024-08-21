package service;
import model.Book;

public class BookService {
    public void sellCopies(Book book, Integer sales){
        Integer total = 0;

        total = book.getCopies() - sales;
        if (total>=0){
            book.setCopies(total);
        }
        else {
            System.out.println("Error, copias insuficientes");
            total = book.getCopies();
        }

    }

    public void addCopies(Book book, Integer addings){
        Integer total = 0;
        total = book.getCopies() + addings;
           book.setCopies(total);


    }

    public void showBook (Book book){
        System.out.println("Book : -ID: " + book.getId() + " -Title: " + book.getTitle()  + " -Author: " + book.getAuthor() + " -Price: " + book.getPrice() + " -Copies: " + book.getCopies());
    }
}
