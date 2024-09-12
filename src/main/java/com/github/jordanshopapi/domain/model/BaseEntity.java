package com.github.jordanshopapi.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

public interface BaseEntity {
    Long getId();
}
