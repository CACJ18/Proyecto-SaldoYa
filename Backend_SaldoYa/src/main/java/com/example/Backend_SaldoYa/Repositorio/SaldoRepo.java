package com.example.Backend_SaldoYa.Repositorio;

import com.example.Backend_SaldoYa.Modelo.SaldoModelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaldoRepo extends CrudRepository<SaldoModelo,Long>{
    
}
