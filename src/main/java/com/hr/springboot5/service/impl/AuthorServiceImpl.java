package com.hr.springboot5.service.impl;

import com.hr.springboot5.dao.AuthorDao;
import com.hr.springboot5.entity.Author;
import com.hr.springboot5.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
    @Cacheable(value="153",key = "'findAll'")
    public List<Author> findAll() {
        Map<String, Object> map=new HashMap<>();
        return authorDao.selectByMap(map);
    }

    @Override
    public Author findById(Integer id) {
        return authorDao.selectById(id);
    }

    @Override
    public int update(Author a) {
        return authorDao.updateById(a);
    }
}
