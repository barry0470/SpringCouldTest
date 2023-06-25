package com.barry.service.impl;

import com.barry.entity.Book;
import com.barry.mapper.BookMapper;
import com.barry.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author barry
 * @version 1.0
 * @date 2023/6/25 17:00
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}