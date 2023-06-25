package com.barry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.awt.print.Book;
import java.util.List;

/**
 * @author barry
 * @version 1.0
 * @date 2023/6/25 17:03
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
