package com.example.Backend_SaldoYa.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteModelo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique=true,nullable = false)
    private Long Cedula;
    private String NombreCompleto;
    private String TipoDocumento;
    private String Correo;
    private String Contraseña;
    private String NumeroCelular;
    private String Direccion;
    private String Sexo;
    private int Saldo;
    
    public Long getCedula() {
        return Cedula;
    }
    public void setCedula(Long cedula) {
        Cedula = cedula;
    }
    public String getNombreCompleto() {
        return NombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }
    public String getTipoDocumento() {
        return TipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
    public String getNumeroCelular() {
        return NumeroCelular;
    }
    public void setNumeroCelular(String numeroCelular) {
        NumeroCelular = numeroCelular;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    public int getSaldo() {
        return Saldo;
    }
    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    

}
