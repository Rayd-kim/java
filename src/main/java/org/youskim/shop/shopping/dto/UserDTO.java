package org.youskim.shop.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String userId;
    private String userPassword;
    private String userName;
    private String phoneNumber;
    private String homeAddr;
    private String userGender;
}
