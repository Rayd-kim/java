package org.youskim.shop.shopping.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.youskim.shop.shopping.entity.Users;

@Repository
@Data
public class UserDao {

    @Autowired
    private UserRepository userRepository;
    
    public Users addUser(Users users) {
        return userRepository.save(users);
    }

}
