package app.models;

public class Book {

    private String name;
    private int isbn;
    private String author;

    public String getName() {
        return name;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
