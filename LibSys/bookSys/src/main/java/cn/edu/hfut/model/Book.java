package cn.edu.hfut.model;

import javax.swing.*;
import java.math.BigDecimal;

public class Book {
    private Long bookId;

    private String bookIsbn;

    private String bookName;

    private Long publisherId;

    private BigDecimal bookPrice;

    private Short bookTotalNum;

    private Short bookNowNum;

    private Short bookReserveNum;

    private Long bookAuthorId;

    private String bookIntroduction;

    private Long bookTypeId;

    private Type bookTypeType;

    private Author bookAuthorType;

    private Publisher bookPublisherType;

    public Book(Long bookId, String bookIsbn, String bookName, Long publisherId, BigDecimal bookPrice, Short bookTotalNum, Short bookNowNum, Short bookReserveNum, Long bookAuthorId, String bookIntroduction, Long bookTypeId) {
        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookName = bookName;
        this.publisherId = publisherId;
        this.bookPrice = bookPrice;
        this.bookTotalNum = bookTotalNum;
        this.bookNowNum = bookNowNum;
        this.bookReserveNum = bookReserveNum;
        this.bookAuthorId = bookAuthorId;
        this.bookIntroduction = bookIntroduction;
        this.bookTypeId = bookTypeId;
    }

    public Book() {
        super();
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn == null ? null : bookIsbn.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Short getBookTotalNum() {
        return bookTotalNum;
    }

    public void setBookTotalNum(Short bookTotalNum) {
        this.bookTotalNum = bookTotalNum;
    }

    public Short getBookNowNum() {
        return bookNowNum;
    }

    public void setBookNowNum(Short bookNowNum) {
        this.bookNowNum = bookNowNum;
    }

    public Short getBookReserveNum() {
        return bookReserveNum;
    }

    public void setBookReserveNum(Short bookReserveNum) {
        this.bookReserveNum = bookReserveNum;
    }

    public Long getBookAuthorId() {
        return bookAuthorId;
    }

    public void setBookAuthorId(Long bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }

    public String getBookIntroduction() {
        return bookIntroduction;
    }

    public void setBookIntroduction(String bookIntroduction) {
        this.bookIntroduction = bookIntroduction == null ? null : bookIntroduction.trim();
    }

    public Long getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Long bookTypeId) {
        this.bookTypeId = bookTypeId;
    }


    public Type getBookTypeType() {
        return bookTypeType;
    }

    public void setBookTypeType(Type bookTypeType) {
        this.bookTypeType = bookTypeType;
    }

    public Author getBookAuthorType() {
        return bookAuthorType;
    }

    public void setBookAuthorType(Author bookAuthorType) {
        this.bookAuthorType = bookAuthorType;
    }

    public Publisher getBookPublisherType() {
        return bookPublisherType;
    }

    public void setBookPublisherType(Publisher bookPublisherType) {
        this.bookPublisherType = bookPublisherType;
    }
}