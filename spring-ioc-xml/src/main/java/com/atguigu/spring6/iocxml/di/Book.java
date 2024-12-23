package com.atguigu.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;
    private String others;

    public Book() {
        System.out.println("无参构造器执行了。。");
    }

    public Book(String bname, String author) {
        System.out.println("有参构造器执行了。。");
        this.bname = bname;
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("Spring 5 开发手册");
        book.setAuthor("郭林");

        //通过构造器注入
        Book book1 = new Book("Spring 4 开发手册", "郭明");
    }
}
