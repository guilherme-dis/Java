package com.company;

public class Booklet {
    private String title;
    private Author author;

    public Booklet(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    // getters and setters omitted for brevity

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
