package com.example.mapper;

import com.example.CriteriaForm;
import com.example.Game;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ooguro on 2017/03/22.
 */
@Mapper
public interface GameMapper {
    @Select("SELECT * FROM games")
    List<Game> findAll();

    List<Game> findBy(@Param("criteria") CriteriaForm criteria);
}
