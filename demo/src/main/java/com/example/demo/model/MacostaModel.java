package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="mascotas")
public class MacostaModel implements Serializable {
     
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;  // Cambiado a tipo de dato Long
    
    @Column(length = 30, nullable = false)
    private String nombre;
    
    @Column(length = 30, nullable = false)
    private String raza;
    @Column(length = 30, nullable = false)
    private String genero;
    @Column(length = 30, nullable = false)
    private Integer edad;
    @Column(length = 30, nullable = false)
    private Integer color;
    @Column(length = 30, nullable = false)
    private String especie;
    @Column(length = 200, nullable = false)
    private Date fecha_nacimiento;
    @Column(length = 30, nullable = false)
    private Integer usuario_id;
       @Column(nullable = false)
    private Boolean activo;


}
