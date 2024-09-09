package com.github.jordanshopapi.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoesResponseDto {
    private String name;
    private String description;
    private String category;
    private double price;
    private String image;
}
