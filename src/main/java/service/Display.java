package service;

import dataobject.Book;
import dataobject.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Display {

  private Book book;
  private User user;
  private int bookPage = 0;

  public void turnPageForward() {
    if (bookPage < book.getBookLength() - 1) {
      System.out.println(book.showPage(++bookPage));
    } else {
      System.out.println(book.showPage(bookPage));
    }
  }

  public void turnPageBackward() {
    if (bookPage > 0) {
      System.out.println(book.showPage(--bookPage));
    } else {
      System.out.println(book.showPage(bookPage));
    }
  }

  public void setUser(User user) {
    this.user = user;
  }
}
