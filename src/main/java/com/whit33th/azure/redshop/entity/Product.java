package com.whit33th.azure.redshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product") // название таблицы MySQL
@Getter // получить автоматические геттеры полей
@Setter // получить автоматические сеттерыполей
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // признак автоинкрементного поля
    @Column(name = "id") // название поля таблицы product
    private Integer Id;  // здесь поле называется с большой буквы. Если будет с маленькой, то поле не будет
    // выводиться в JSON API. Не то баг, не то фича.

    @Column(name = "title") // название поля таблицы product
    private String name;   // внутреннее имя поля (может отличаться от названия поля в таблице)

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "image")
    private String image;

    @Column(name = "category")
    private String category;

    @Column(name = "size")
    private String size;

    @Column(name = "gender")
    private String gender;

    @Column(name = "season")
    private String season;
}
