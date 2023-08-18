package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="empleados")
public class EmpleadoModel implements Serializable {
    
     
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;  // Cambiado a tipo de dato Long
    
    @Column(length = 30, nullable = false)
    private String nombre;
    
    @Column(length = 30, nullable = false)
    private String apellido;
    @Column(length = 30, nullable = false)
    private String direccion;
    @Column(length = 30, nullable = false)
    private Integer celular;
    @Column(length = 30, nullable = false)
    private Integer documento;
    @Column(length = 30, nullable = false)
    private String rol;
    @Column(length = 200, nullable = false, unique=true)
    private String email;
    @Column(length = 30, nullable = false)
    private String password;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getCelular() {
        return celular;
    }
    public void setCelular(Integer celular) {
        this.celular = celular;
    }
    public Integer getDocumento() {
        return documento;
    }
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "EmpleadoModel [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
                + ", celular=" + celular + ", documento=" + documento + ", rol=" + rol + ", email=" + email
                + ", password=" + password + "]";
    }


}
