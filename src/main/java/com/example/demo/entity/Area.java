package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "areas")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(
            length = 50,
            nullable = false
    )
    private String nombre;
    @Column(
            length = 100,
            nullable = false
    )
    private String nombreEncargado;
    private Integer numeroFuncionario;

    public Area() {
    }

    public Area(Long id, String nombre, String nombreEncargado, Integer numeroFuncionario) {
        this.id = id;
        this.nombre = nombre;
        this.nombreEncargado = nombreEncargado;
        this.numeroFuncionario = numeroFuncionario;
    }

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

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }
}
