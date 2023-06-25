package com.barry.service;

import com.barry.entity.Book;

/**
 * @author barry
 * @version 1.0
 * @date 2023/6/25 16:59
 */
public interface BookService {
    Book getBookById(int bid);
}
