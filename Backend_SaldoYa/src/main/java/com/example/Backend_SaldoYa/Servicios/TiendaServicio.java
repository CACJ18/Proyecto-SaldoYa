package com.example.Backend_SaldoYa.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.TiendaModelo;
import com.example.Backend_SaldoYa.Repositorio.TiendaRepo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaServicio {
    @Autowired
    TiendaRepo tiendaRepo;
    //Crea Tiendas
    public TiendaModelo guardarTienda(TiendaModelo tienda){
        return tiendaRepo.save(tienda);
    }

    //Busca las tiendas registradas
    public ArrayList<TiendaModelo> obtenerTiendas(){
        return (ArrayList<TiendaModelo>) tiendaRepo.findAll();
    }

    public Optional<TiendaModelo> consultarRu(Long ru){
        return tiendaRepo.findByRu(ru);
        }
}
