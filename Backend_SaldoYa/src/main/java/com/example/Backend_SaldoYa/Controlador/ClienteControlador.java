package com.example.Backend_SaldoYa.Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.Backend_SaldoYa.Modelo.ClienteModelo;
import com.example.Backend_SaldoYa.Servicios.ClienteServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/cliente")
public class ClienteControlador {
    @Autowired
    ClienteServicio clienteServicio;
    
    @GetMapping
    public ArrayList<ClienteModelo>obtenerCliente(){
        return clienteServicio.obtenerClientes();
    }
     
    @PostMapping
    public ClienteModelo guardarCliente(@RequestBody ClienteModelo cliente){
        return clienteServicio.guardarCliente(cliente);
    }

    @GetMapping(path="/{cedula}")
    public Optional<ClienteModelo> consultarRu(@PathVariable("cedula") Long Cedula){
        return this.clienteServicio.ConsultarCedula(Cedula);
    }


}
