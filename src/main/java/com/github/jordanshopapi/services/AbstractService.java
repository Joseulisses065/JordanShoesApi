package com.github.jordanshopapi.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractService<T> {
    protected abstract JpaRepository getRepository();

    public List<T> findAll(){
        return getRepository().findAll();
    }


}
