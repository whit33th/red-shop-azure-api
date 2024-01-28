package com.whit33th.azure.redshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "id_user")
    private int id_user;

    @Column(name = "id_product")
    private int id_product;

    @Column(name = "address")
    private int address;

    @Column(name = "id_code")
    private int id_code;

    @Column(name = "tel")
    private int tel;

    @Column(name = "price")
    private int price;


}
