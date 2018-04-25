package com.wcapp.mybatis.dao;

import com.wcapp.mybatis.entity.Person;

import java.util.List;
import java.util.Map;

public interface PersonMapper {
   List<Map<?,?>> personShow();
}