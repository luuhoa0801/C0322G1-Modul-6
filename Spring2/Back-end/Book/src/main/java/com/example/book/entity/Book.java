package com.example.book.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeBook;
    private String author;
    private String translator;
    private String publishingHome;
    private int numberOfPages;
    private int size;
    private LocalDate releaseDate;

    @Column(columnDefinition = "BIT(1) DEFAULT 0")
    private Boolean isDeleted;

    public Book() {
    }

    public Book(Integer id, String codeBook, String author, String translator, String publishingHome,
                int numberOfPages, int size, LocalDate releaseDate, Boolean isDeleted) {
        this.id = id;
        this.codeBook = codeBook;
        this.author = author;
        this.translator = translator;
        this.publishingHome = publishingHome;
        this.numberOfPages = numberOfPages;
        this.size = size;
        this.releaseDate = releaseDate;
        this.isDeleted = isDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublishingHome() {
        return publishingHome;
    }

    public void setPublishingHome(String publishingHome) {
        this.publishingHome = publishingHome;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
