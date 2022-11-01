package hw_13_1;

import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(int year, String title, Author author) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " " + year + " " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, author);
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return (Author) this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}