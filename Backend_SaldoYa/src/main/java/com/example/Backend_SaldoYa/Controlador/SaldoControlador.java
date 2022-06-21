package com.example.Backend_SaldoYa.Controlador;

import java.util.ArrayList;

import com.example.Backend_SaldoYa.Modelo.SaldoModelo;
import com.example.Backend_SaldoYa.Servicios.SaldoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/saldo")
public class SaldoControlador {
    @Autowired
    SaldoServicio saldoServicio;
    
    @GetMapping
    public ArrayList<SaldoModelo>obtenerSaldos(){
        return saldoServicio.obtenerSaldos();
    }

    @PostMapping
    public SaldoModelo guardarSaldo(@RequestBody SaldoModelo saldo){
        return saldoServicio.guardarSaldo(saldo);
    }
}
