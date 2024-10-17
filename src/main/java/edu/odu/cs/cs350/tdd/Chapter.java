package edu.odu.cs.cs350.tdd;

/**
 * An chapter within a book.  An chapter has a title and a page length.
 * 
 * @author zeil
 *
 */
public class Chapter implements Cloneable {

  /**
   * The title of this chapter.
   */
  private String title;
  
  /**
   * The number of pages in this chapter.
   */
  private int nPages;
  
  /**
   * Create a chapter.
   * @param title  the title of the chapter
   * @param numPages the length of the chapter
   */
  public Chapter (String title, int numPages) {
    this.title = title;
    this.nPages = numPages;
  }
  
  /**
   * Compare two chapters for equality.
   * 
   * @param obj another author
   * @return true ff they have the same name
   */
  public boolean equals(Object obj) {
    if (obj instanceof Chapter) {
      Chapter au = (Chapter) obj;
      return nPages == au.nPages
          && title.equals(au.title);
    } else {
      return false;
    }
  }
  
  /**
   * Return a description of the chapter.
   */
  public String toString() {
    return '"' + title  + '"' + " pp: " + nPages;
  }
  
  /**
   * Hash function for chapters.
   */
  public int hashCode() {
      return title.hashCode() * 13 + nPages;
  }
  
  /**
   * Return the surname of this author
   * @return the surname
   */
  public String getTitle() {
    return title;
  }
  
  public int getNumberOfPages() {
	  return nPages;
  }
  
  
  public Object clone() {
      return new Chapter(title, nPages);
  }

  

}
