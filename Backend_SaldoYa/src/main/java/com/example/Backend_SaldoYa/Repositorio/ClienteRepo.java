package com.example.Backend_SaldoYa.Repositorio;
import java.util.List;
import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.ClienteModelo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends CrudRepository<ClienteModelo,Long>{
    @Query(" FROM ClienteModelo WHERE Cedula = :Cedula")
    Optional<ClienteModelo> findByCedula(
        @Param("Cedula") Long Cedula);
}