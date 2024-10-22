package org.youskim.shop.shopping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.youskim.shop.shopping.entity.Users;
import org.youskim.shop.shopping.dao.UserDao;

@SpringBootTest
public class DBtests {
    @Autowired
    private UserDao userDao;

}
