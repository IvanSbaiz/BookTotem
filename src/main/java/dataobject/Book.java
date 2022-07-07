package dataobject;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class Book {

  @Getter private final int id;
  @Getter private final String title;
  @Getter private final String description;
  private final List<String> pages;

  public Book(int id, String title, String description) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.pages = new ArrayList<>();
  }

  public String showPage(int bookPage) {
    return pages.get(bookPage);
  }

  public int getBookLength() {
    return pages.size();
  }

  public void addPage(String page) {
    this.pages.add(page);
  }
}
