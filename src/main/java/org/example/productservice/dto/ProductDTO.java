package org.example.productservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
