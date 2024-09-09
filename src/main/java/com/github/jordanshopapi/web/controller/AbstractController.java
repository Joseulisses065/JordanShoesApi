package com.github.jordanshopapi.web.controller;

import com.github.jordanshopapi.domain.model.BaseEntity;
import com.github.jordanshopapi.services.AbstractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public abstract class AbstractController<T extends BaseEntity> {

    protected abstract AbstractService getService();

    @GetMapping()
    public ResponseEntity<List<T>> getAll() {
        return ResponseEntity.ok().body(getService().findAll());
    }


}
