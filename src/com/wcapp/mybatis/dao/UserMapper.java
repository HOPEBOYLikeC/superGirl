package com.wcapp.mybatis.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface UserMapper {
   List<Map<?,?>> selectAll();
}