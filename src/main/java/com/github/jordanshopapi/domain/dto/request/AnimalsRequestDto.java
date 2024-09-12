package com.github.jordanshopapi.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalsRequestDto {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Type cannot be empty")
    private String type;

    @NotNull(message = "Age cannot be null")
    private Integer age;
}
