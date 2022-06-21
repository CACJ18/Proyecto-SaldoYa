package com.example.Backend_SaldoYa.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tienda")
public class TiendaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    long id;
    @Column(unique = true, nullable = false)
    long Ru;
    public long getRu() {
        return Ru;
    }
    public void setRu(long ru) {
        Ru = ru;
    }
    String NombreTienda;
    String tipoNegocio;
    String Contraseña;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombreTienda() {
        return NombreTienda;
    }
    public void setNombreTienda(String nombreTienda) {
        NombreTienda = nombreTienda;
    }
    public String getTipoNegocio() {
        return tipoNegocio;
    }
    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
    
        
}
