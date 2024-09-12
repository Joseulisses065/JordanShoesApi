package com.github.jordanshopapi.services;

import com.github.jordanshopapi.domain.model.BaseEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T extends BaseEntity> {
    protected abstract JpaRepository getRepository();

    public List<T> findAll() {
        return getRepository().findAll();
    }

    public Optional<T> findByid(Long id) {
        if (id != null) return getRepository().findById(id);
        return Optional.empty();
    }

}
