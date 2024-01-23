package org.quarkus.dtos;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Book extends PanacheEntity {


    private String title;
    private int pages;
    private LocalDate pubDate;
    private String description;

    public Book() {
    }

    public Book(String title, int pages, LocalDate pubDate, String description) {
        this.title = title;
        this.pages = pages;
        this.pubDate = pubDate;
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", pubDate=" + pubDate +
                ", description='" + description + '\'' +
                '}';
    }
}
