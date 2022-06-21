package com.example.Backend_SaldoYa.Repositorio;

import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.TiendaModelo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepo extends CrudRepository<TiendaModelo,Long>{
    @Query("From TiendaModelo WHERE ru=:ru")
    Optional<TiendaModelo> findByRu(@Param("ru") Long ru);
    
}