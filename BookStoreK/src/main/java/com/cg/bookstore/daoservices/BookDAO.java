package com.cg.bookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Books;

public interface BookDAO extends JpaRepository<Books, Integer>{}
