package com.zhibo.bean;

public class Book {
    private  String nName;
    private  String author;
    private  Double price;
    private  String publish;

    @Override
    public String toString() {
        return "Book{" +
                "nName='" + nName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publish='" + publish + '\'' +
                '}';
    }

    public Book() {
    }

    public Book(String nName, String author, Double price, String publish) {
        this.nName = nName;
        this.author = author;
        this.price = price;
        this.publish = publish;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getnName() {
        return nName;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public String getPublish() {
        return publish;
    }

}
