package com.isga.billingservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}