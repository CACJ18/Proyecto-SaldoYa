package com.example.Backend_SaldoYa.Controlador;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.TiendaModelo;
import com.example.Backend_SaldoYa.Servicios.TiendaServicio;

import org.hibernate.SQLQuery.RootReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/tienda")
public class TiendaControlador {
    @Autowired
    TiendaServicio tiendaServicio;

    @GetMapping
    public ArrayList<TiendaModelo> obtenerTienda(){
        return (ArrayList<TiendaModelo>) tiendaServicio.obtenerTiendas();
    }

    @PostMapping
    public TiendaModelo guardarTienda(@RequestBody TiendaModelo tienda){
        return tiendaServicio.guardarTienda(tienda);
    }

    @GetMapping(path="/{ru}")
    public Optional<TiendaModelo> consultaRu(@PathVariable("ru") Long ru){
        return this.tiendaServicio.consultarRu(ru);
    }
}
