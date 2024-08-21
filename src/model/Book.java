package model;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Double price;
    private Integer copies;

    public Book(Integer id, String title, String author, Double price, Integer copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.copies = copies;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    private Integer id(){
        this.id++;
        return id;

    }
}
