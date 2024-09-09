package com.github.jordanshopapi.repositories;

import com.github.jordanshopapi.domain.model.Shoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, Integer> {
}
