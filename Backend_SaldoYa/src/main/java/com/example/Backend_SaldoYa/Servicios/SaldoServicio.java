package com.example.Backend_SaldoYa.Servicios;

import java.util.ArrayList;

import com.example.Backend_SaldoYa.Modelo.SaldoModelo;
import com.example.Backend_SaldoYa.Repositorio.SaldoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaldoServicio {
    @Autowired
    SaldoRepo saldoRepo;

    public SaldoModelo guardarSaldo(SaldoModelo saldo){
        return saldoRepo.save(saldo);
    }

    public ArrayList<SaldoModelo> obtenerSaldos(){
        return (ArrayList<SaldoModelo>) saldoRepo.findAll();
    }
}
