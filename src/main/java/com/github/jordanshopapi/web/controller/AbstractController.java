package com.github.jordanshopapi.web.controller;

import com.github.jordanshopapi.domain.model.BaseEntity;
import com.github.jordanshopapi.services.AbstractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public abstract class AbstractController<T extends BaseEntity> {
/*
    protected abstract AbstractService getService();

    @GetMapping()
    public ResponseEntity<List<T>> getAll() {
        return ResponseEntity.ok().body(getService().findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getEntity(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body((T) getService().findByid(id).orElse(null));
    }

    @PostMapping()
    public ResponseEntity<T> saveEntity() {
        return ResponseEntity.ok().body(getService().findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<T>> updateEntity() {
        return ResponseEntity.ok().body(getService().findAll());
    }

    @DeleteMapping()
    public ResponseEntity<T> deleteEntity() {
        return ResponseEntity.ok().body(getService().findAll());
    }

*/
}
