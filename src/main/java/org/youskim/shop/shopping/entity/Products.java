package org.youskim.shop.shopping.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Entity
public class Products extends BaseTimeEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long productId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private String productSize;

    @Column(nullable = false)
    private int productPrice;

    private String imageAddr;

    private String productGender;

    private String productDesc;

}
