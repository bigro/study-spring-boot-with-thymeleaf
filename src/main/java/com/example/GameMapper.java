package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ooguro on 2017/03/22.
 */
@Mapper
public interface GameMapper {
    @Select("SELECT * FROM games")
    List<Game> findAll();
}
