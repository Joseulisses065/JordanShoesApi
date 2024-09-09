package com.github.jordanshopapi.web.controller;

import com.github.jordanshopapi.domain.dto.mapper.EntityMapper;
import com.github.jordanshopapi.domain.dto.response.ShoesResponseDto;
import com.github.jordanshopapi.services.ShoesService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/shoes")
public class ShoesController {
    @Autowired
    private ShoesService shoesService;

    @GetMapping
    public ResponseEntity<List<ShoesResponseDto>> getAllShoes() {
        List<ShoesResponseDto> shoes = EntityMapper.mapToList(shoesService.findAll(), ShoesResponseDto.class);
        return ResponseEntity.ok().body(shoes);
    }
}
