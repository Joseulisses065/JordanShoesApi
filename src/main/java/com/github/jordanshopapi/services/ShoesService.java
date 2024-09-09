package com.github.jordanshopapi.services;

import com.github.jordanshopapi.domain.model.Shoes;
import com.github.jordanshopapi.repositories.ShoesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShoesService extends AbstractService<Shoes> {

    @Autowired
    private ShoesRepository shoesRepository;

    @Override
    protected JpaRepository getRepository() {
        return shoesRepository;
    }



}
