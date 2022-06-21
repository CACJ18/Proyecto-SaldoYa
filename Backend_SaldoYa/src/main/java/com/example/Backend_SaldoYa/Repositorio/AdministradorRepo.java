package com.example.Backend_SaldoYa.Repositorio;

import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.AdministradorModelo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepo extends CrudRepository<AdministradorModelo,Long>{
    @Query(" FROM AdministradorModelo WHERE Cedula = :Cedula")
    Optional<AdministradorModelo> findByCedula(
        @Param("Cedula") Long Cedula);
}
