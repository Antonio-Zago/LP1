package com.example.carros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carros.models.carro;


@Repository
public interface CarroRepository extends JpaRepository<carro, Integer>{

}
