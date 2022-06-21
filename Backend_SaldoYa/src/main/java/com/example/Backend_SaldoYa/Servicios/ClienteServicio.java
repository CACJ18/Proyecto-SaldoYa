package com.example.Backend_SaldoYa.Servicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.ClienteModelo;
import com.example.Backend_SaldoYa.Repositorio.ClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    @Autowired
    ClienteRepo clienteRepo;
    
    //Guarda un Cliente
    public ClienteModelo guardarCliente(ClienteModelo cliente){
        return clienteRepo.save(cliente);
    }

    //duelve un array de todos los clientes en la BD
    public ArrayList<ClienteModelo> obtenerClientes(){
        return (ArrayList<ClienteModelo>) clienteRepo.findAll();
    }
    
    /*
    public Optional<ClienteModelo> consultar(Long id){
        return clienteRepo.findById(id);
    }
*/
    public Optional<ClienteModelo> ConsultarCedula(Long Cedula){
        return clienteRepo.findByCedula(Cedula);
    }
    
}
