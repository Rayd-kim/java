package org.youskim.shop.shopping.entity;

import jakarta.persistence.*;

@Entity
public class Products {

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
