package org.youskim.shop.shopping.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Users {

    @Id
    @Column(length = 20)
    @Size(min = 6, max = 20)
    private String userId;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String homeAddr;

    @Column(nullable = true)
    private String userGender;
}
