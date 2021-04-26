package com.persistence.demo.demo02;

import com.persistence.demo.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BookServiceTest {

  @Test
  public void shouldManageBook() {

    BookService service = new BookService();

    // Creates and persists a Book
    Book book = service.createBook(4044L, "H2G2", "Best IT Scifi Book", 12.5f, "1234-5678-5678", 247);
    assertNotNull(book);

    // Finds the book
    book = service.findBook(4044L);
    assertEquals(new Float(12.5f), book.getUnitCost());

    // Raises the price of the book
    book = service.raiseUnitCost(4044L, 12.5F);
    assertEquals(new Float(25.0f), book.getUnitCost());

    // Removes the book
    service.removeBook(4044L);

    // Finds the book
    book = service.findBook(4044L);
    assertNull(book);
  }
}


