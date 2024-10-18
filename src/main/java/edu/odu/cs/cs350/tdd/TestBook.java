package edu.odu.cs.cs350.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;



public class TestBook {
  
  /**
   * Test method for {@link edu.odu.cs.cs350.Book#Magazine()}.
   */
  @Test
  public void testAddChapter() {
    Book book = new Book("Test Book");

        // Create two chapters
        Chapter chapter1 = new Chapter("Introduction", 10);
        Chapter chapter2 = new Chapter("Chapter 1", 20);

        // Add the chapters to the book
        book.addChapter(chapter1);
        book.addChapter(chapter2);

        // Assert that the chapters were added correctly
        assertEquals(2, book.getSize()); // Check if both chapters were added
        assertEquals(30, book.getTotalPages());     // Check if total pages is updated correctly

        // Check the titles of the chapters to verify they are in the correct order
        assertEquals("Introduction", book.contents.get(0).getTitle());
        assertEquals("Chapter 1", book.contents.get(1).getTitle());
    }
  }
