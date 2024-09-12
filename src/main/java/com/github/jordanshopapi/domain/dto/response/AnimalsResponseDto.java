package com.github.jordanshopapi.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalsResponseDto {
    private Integer id;
    private String name;
    private String type;
    private int age;
}
