package com.github.jordanshopapi.web.controller;

import com.github.jordanshopapi.domain.dto.request.AnimalsRequestDto;
import com.github.jordanshopapi.domain.dto.response.AnimalsResponseDto;
import com.github.jordanshopapi.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalsController {

    @Autowired
    private AnimalService animalService;

    @GetMapping()
    public ResponseEntity<List<AnimalsResponseDto>> getAllAnimals() {
        return ResponseEntity.ok().body(animalService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalsResponseDto> getAnimal(@PathVariable("id") Long id) {
        var animal  = animalService.findByid(id);
        return ResponseEntity.ok().body(animal);
    }

    @PostMapping()
    public ResponseEntity<AnimalsResponseDto> saveEntity(@RequestBody AnimalsRequestDto request) {
        AnimalsResponseDto animal  = animalService.save(request);
        URI url = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(animal.getId()).toUri();
        return ResponseEntity.created(url).body(animal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnimalsResponseDto> updateEntity(@RequestBody AnimalsRequestDto request, @PathVariable("id") Long id) {
        AnimalsResponseDto animal = animalService.update(id, request);
        return ResponseEntity.ok().body(animal);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<AnimalsResponseDto> deleteEntity(@PathVariable("id") Long id) {
        var animal = animalService.delete(id);
        return ResponseEntity.ok().body(animal);
    }


}
