package com.github.jordanshopapi.services;

import com.github.jordanshopapi.domain.dto.mapper.EntityMapper;
import com.github.jordanshopapi.domain.dto.request.AnimalsRequestDto;
import com.github.jordanshopapi.domain.dto.response.AnimalsResponseDto;
import com.github.jordanshopapi.domain.model.Animal;
import com.github.jordanshopapi.repositories.AnimalRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<AnimalsResponseDto> findAll() {
        var animals = animalRepository.findAll();
        return EntityMapper.mapToList(animals, AnimalsResponseDto.class);
    }

    public AnimalsResponseDto findByid(Long id) {
        var anime = animalRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return EntityMapper.mapToObject(anime, AnimalsResponseDto.class);
    }

    public AnimalsResponseDto save(AnimalsRequestDto entity) {
        var request = EntityMapper.mapToObject(entity, Animal.class);
        animalRepository.save(request);
        return EntityMapper.mapToObject(request, AnimalsResponseDto.class);
    }

    public AnimalsResponseDto delete(Long id) {
        var animal = animalRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        animalRepository.delete(animal);
        return EntityMapper.mapToObject(animal, AnimalsResponseDto.class);
    }

    public AnimalsResponseDto update(Long id,AnimalsRequestDto source) {
        var animal = animalRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        EntityMapper.modelMapper.map(source, animal);
        var resonse  = animalRepository.save(animal);
        return EntityMapper.mapToObject(resonse, AnimalsResponseDto.class);
    }

}
