package com.example.Backend_SaldoYa.Controlador;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.AdministradorModelo;
import com.example.Backend_SaldoYa.Servicios.AdministradorServicio;

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
@RequestMapping("/admin")
public class AdministradorControlador {
    @Autowired
    AdministradorServicio adminServicio;

    @GetMapping
    public ArrayList<AdministradorModelo> obtenerAdmiins(){
        return adminServicio.obtenerAdmin();
    }
    @PostMapping
    public AdministradorModelo guardarAdministrador(@RequestBody AdministradorModelo admin){
        return adminServicio.guardarAdministrador(admin);
    }
    @GetMapping(path = "/{cedula}")
    public Optional<AdministradorModelo> consultaCedula(@PathVariable("cedula") Long Cedula){
        return this.adminServicio.consultarCedula(Cedula);
    }

}
