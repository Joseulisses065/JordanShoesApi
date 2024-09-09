package com.github.jordanshopapi.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoesRequestDto {
    @NotBlank(message = "name can't be empty")
    private String name;
    @NotBlank(message = "description can't be empty")
    private String description;
    @NotBlank(message = "categry can't be empty")
    private String category;
    @NotNull(message = "price can't be null")
    private double price;
    @NotBlank(message = "image can't be empty")
    private String image;
}
