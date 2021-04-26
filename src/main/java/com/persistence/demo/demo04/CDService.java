package com.persistence.demo.demo04;

import com.persistence.demo.CD;

import javax.persistence.EntityManager;

public class CDService {

  // ======================================
  // =             Attributes             =
  // ======================================

  private EntityManager em;

  // ======================================
  // =            Constructors            =
  // ======================================

  public CDService(EntityManager em) {
    this.em = em;
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

  public CD createCD(CD book) {
    em.persist(book);
    return book;
  }

  public void removeCD(CD book) {
    em.remove(em.merge(book));
  }

  public CD findCD(Long id) {
    return em.find(CD.class, id);
  }
}