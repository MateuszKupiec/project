package com.mateusz.project.domain;

public class BookDto {

    private String title;
    private String author;

    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    BookDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
