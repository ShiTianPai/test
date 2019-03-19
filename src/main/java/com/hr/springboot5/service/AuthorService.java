package com.hr.springboot5.service;

import com.hr.springboot5.entity.Author;

import java.util.List;

public interface AuthorService {
    public List<Author> findAll();
    public Author findById(Integer id);
    public int update(Author a);
}
