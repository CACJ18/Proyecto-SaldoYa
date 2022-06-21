package com.example.Backend_SaldoYa.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regSaldo")
public class SaldoModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    long id;
    long idTienda;
    long cedula;
    int valorSaldo;
    
    
    
    public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}

    public long getIdTienda() {
        return idTienda;
    }
    public void setIdTienda(long idTienda) {
        this.idTienda = idTienda;
    }
    public long getCedula() {
        return cedula;
    }
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    public int getValorSaldo() {
        return valorSaldo;
    }
    public void setValorSaldo(int valorSaldo) {
        this.valorSaldo = valorSaldo;
    }
    

}
