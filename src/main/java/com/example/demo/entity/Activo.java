package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "activos")
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            length = 100,
            nullable = false
    )
    private String tipoActivo;
    @Column(
            length = 50,
            nullable = false
    )
    private String marca;

    @Column(
            length = 50,
            nullable = false
    )
    private String modelo;

    @Column(
            length = 20,
            nullable = false
    )
    private String estado;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;


    public Activo() {
    }

    public Activo(Long id, String tipoActivo, String marca, String modelo, String estado, Area area) {
        this.id = id;
        this.tipoActivo = tipoActivo;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.area = area;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(String tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
