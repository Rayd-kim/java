package org.youskim.shop.shopping.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.youskim.shop.shopping.entity.Users;

import java.util.Optional;

@Repository
@Data
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    // 회원가입에 사용
    public Users addUser(Users users) {
        return userRepository.save(users);
    }

    // 회원탈퇴에 사용
//    public void deleteUser(Users users) {
//        userRepository.delete(users);
//    }
    public void deleteUser(String userId) {
        Users user = this.getUser(userId);
        if (user != null) {
            userRepository.delete(user);
        } else {
            System.out.println("User not found");
        }

    }

    // 회원정보 변경에 사용
    public Users updateUsers(Users users) {
        return userRepository.save(users);
    }

    // 회원인지 확인할 때 사용 (비밀번호 변경 같은)
    public Users getUser(String userId) {
        Optional<Users> user = userRepository.findById(userId);
        return user.orElse(null);
    }

}
