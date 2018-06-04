package com.example.wxample.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Book {
    private int bookid;
    private String bookname;
    private String author;
    private int price;
    private String imgsrc;
    private Integer publishyear;
    private Integer bookstorage;
    private Integer category;
    private String summary;
    private Integer sales;

    @Id
    @Column(name = "bookid")
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    @Basic
    @Column(name = "bookname")
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "imgsrc")
    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    @Basic
    @Column(name = "publishyear")
    public Integer getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(Integer publishyear) {
        this.publishyear = publishyear;
    }

    @Basic
    @Column(name = "bookstorage")
    public Integer getBookstorage() {
        return bookstorage;
    }

    public void setBookstorage(Integer bookstorage) {
        this.bookstorage = bookstorage;
    }

    @Basic
    @Column(name = "category")
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Basic
    @Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "sales")
    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookid == book.bookid &&
                price == book.price &&
                Objects.equals(bookname, book.bookname) &&
                Objects.equals(author, book.author) &&
                Objects.equals(imgsrc, book.imgsrc) &&
                Objects.equals(publishyear, book.publishyear) &&
                Objects.equals(bookstorage, book.bookstorage) &&
                Objects.equals(category, book.category) &&
                Objects.equals(summary, book.summary) &&
                Objects.equals(sales, book.sales);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookid, bookname, author, price, imgsrc, publishyear, bookstorage, category, summary, sales);
    }
}
