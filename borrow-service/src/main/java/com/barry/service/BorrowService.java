package com.barry.service;

import com.barry.entity.UserBorrowDetail;

/**
 * @author barry
 * @version 1.0
 * @date 2023/6/25 17:02
 */
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
