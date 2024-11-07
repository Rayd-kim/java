package org.youskim.shop.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.youskim.shop.shopping.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {
}
