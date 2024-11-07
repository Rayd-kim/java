package org.youskim.shop.shopping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.youskim.shop.shopping.dao.UserDao;
import org.youskim.shop.shopping.dto.UserDTO;
import org.youskim.shop.shopping.entity.Users;

@SpringBootTest
public class UserDaoTests {
    private UserDTO user1;
    private UserDTO user2;
    private UserDTO user3;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @BeforeEach
    void setUser() {
        user1 = UserDTO.builder().userId("user1")
                .userPassword("12345678")
                .userName("김유성1")
                .phoneNumber("01056793181")
                .homeAddr("몰라요")
                .userGender("남자")
                .build();

        user2 = UserDTO.builder().userId("user2")
                .userPassword("qwertyui")
                .userName("김유성2")
                .phoneNumber("01046523181")
                .homeAddr("서해안로 2205")
                .userGender("여자")
                .build();

        user3 = UserDTO.builder().userId("user3")
                .userPassword("asdfghjk")
                .userName("김유성3")
                .phoneNumber("01036712866")
                .homeAddr("신림동 475-22")
                .build();
    }

    @Test
    void addTest() {
        System.out.println("add Test start");
        String encodedPw = passwordEncoder.encode(user3.getUserPassword());
        user3.setUserPassword(encodedPw);
        Users user = modelMapper.map(user3, Users.class);
        userDao.addUser(user);
        System.out.println(passwordEncoder.matches("12345678", user3.getUserPassword()));
        System.out.println(passwordEncoder.matches("qwertyui", user3.getUserPassword()));
        System.out.println(passwordEncoder.matches("asdfghjk", user3.getUserPassword()));
        System.out.println("add Test end");
    }

    @Test
    void deleteTest() {
        System.out.println("delete Test start");
        userDao.deleteUser(user1.getUserId());
        System.out.println("delete Test end");
    }


}
