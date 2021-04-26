package com.persistence.demo.demo03;

import com.persistence.demo.Author;

import javax.persistence.EntityManager;

public class AuthorService {

  // ======================================
  // =             Attributes             =
  // ======================================

  private EntityManager em;

  // ======================================
  // =            Constructors            =
  // ======================================

  public AuthorService(EntityManager em) {
    this.em = em;
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

  public Author createAuthor(Author book) {
    em.persist(book);
    return book;
  }

  public void removeAuthor(Author book) {
    em.remove(em.merge(book));
  }

  public Author findAuthor(Long id) {
    return em.find(Author.class, id);
  }
}