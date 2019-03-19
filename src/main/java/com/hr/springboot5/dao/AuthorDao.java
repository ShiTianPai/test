package com.hr.springboot5.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.springboot5.entity.Author;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorDao extends BaseMapper<Author> {

}
