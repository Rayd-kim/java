package org.youskim.shop.shopping.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Users extends BaseTimeEntity {

    @Id
    @Column(length = 20)
    @Size(min = 1, max = 20)
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
