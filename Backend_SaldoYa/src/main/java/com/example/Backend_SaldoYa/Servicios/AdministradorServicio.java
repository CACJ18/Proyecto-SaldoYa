package com.example.Backend_SaldoYa.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.AdministradorModelo;
import com.example.Backend_SaldoYa.Repositorio.AdministradorRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServicio {
    @Autowired
    AdministradorRepo adminRepo;


    public AdministradorModelo guardarAdministrador(AdministradorModelo admin){
        return adminRepo.save(admin);
    }

    public ArrayList<AdministradorModelo> obtenerAdmin(){
        return (ArrayList<AdministradorModelo>) adminRepo.findAll();
    }

    public Optional<AdministradorModelo> consultarCedula(Long cedula){
        return adminRepo.findByCedula(cedula);
    }

}
