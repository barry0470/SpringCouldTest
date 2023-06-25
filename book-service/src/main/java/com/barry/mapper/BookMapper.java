package com.barry.mapper;

import com.barry.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;




/**
 * @author barry
 * @version 1.0
 * @date 2023/6/25 16:59
 */
@Mapper
public interface BookMapper {

    @Select("select * from DB_BOOK where bid = #{bid}")
    Book getBookById(int bid);
}