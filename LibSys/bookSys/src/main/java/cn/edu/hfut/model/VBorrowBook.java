package cn.edu.hfut.model;


public class VBorrowBook {

  private long bookId;
  private String bookIsbn;
  private String bookName;
  private long publisherId;
  private double bookPrice;
  private long bookTotalNum;
  private long bookLeftNum;
  private long bookReserveNum;
  private long bookAuthorId;
  private String bookIntroduction;
  private long bookTypeId;
  private String publisherName;
  private String authorName;


  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public long getPublisherId() {
    return publisherId;
  }

  public void setPublisherId(long publisherId) {
    this.publisherId = publisherId;
  }


  public double getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(double bookPrice) {
    this.bookPrice = bookPrice;
  }


  public long getBookTotalNum() {
    return bookTotalNum;
  }

  public void setBookTotalNum(long bookTotalNum) {
    this.bookTotalNum = bookTotalNum;
  }


  public long getBookLeftNum() {
    return bookLeftNum;
  }

  public void setBookLeftNum(long bookLeftNum) {
    this.bookLeftNum = bookLeftNum;
  }


  public long getBookReserveNum() {
    return bookReserveNum;
  }

  public void setBookReserveNum(long bookReserveNum) {
    this.bookReserveNum = bookReserveNum;
  }


  public long getBookAuthorId() {
    return bookAuthorId;
  }

  public void setBookAuthorId(long bookAuthorId) {
    this.bookAuthorId = bookAuthorId;
  }


  public String getBookIntroduction() {
    return bookIntroduction;
  }

  public void setBookIntroduction(String bookIntroduction) {
    this.bookIntroduction = bookIntroduction;
  }


  public long getBookTypeId() {
    return bookTypeId;
  }

  public void setBookTypeId(long bookTypeId) {
    this.bookTypeId = bookTypeId;
  }


  public String getPublisherName() {
    return publisherName;
  }

  public void setPublisherName(String publisherName) {
    this.publisherName = publisherName;
  }


  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

}
