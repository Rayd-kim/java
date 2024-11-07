package org.youskim.shop.shopping.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.youskim.shop.shopping.dao.UserDao;
import org.youskim.shop.shopping.dto.UserDTO;
import org.youskim.shop.shopping.entity.Users;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final ModelMapper modelMapper;
    private final UserDao userDao;

    public String signIn(UserDTO userDTO) {
        Users user = modelMapper.map(userDTO, Users.class);
        userDao.addUser(user);
        return user.getUserName(); // 이름 알려줘서 가입인사 alter 해주기
    }
}
