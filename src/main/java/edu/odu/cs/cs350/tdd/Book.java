package edu.odu.cs.cs350.tdd;

import java.util.ArrayList;

/**
 * A book containing a collection of chapters, organized by (starting) page number.
 * 
 * 
 * @author zeil
 *
 */
public class Book /*implements Iterable<Chapter>*/ {

  
  

  private String title;
  private ArrayList<Chapter> contents;
  private int totalPages;  


  /**
   * Create a new book with no chapters.
   * @param title title of the book
   */
  public Book(String title) {
    this.title = title;
    contents = new ArrayList<>();
    totalPages = 0;
  }
  
  public int getTotalPages(){
    return totalPages;
  }

public int getSize(){
  return contents.size();
}

public ArrayList<Chapter> getChapters() {
  return this.contents;
}


  public void addChapter(Chapter chapter) {
    contents.add(chapter);
    totalPages += chapter.getNumberOfPages();
    
}
  
}
