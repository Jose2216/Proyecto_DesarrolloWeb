package com.proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long idCategoria;
    private String nombre_categoria;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_categoria", updatable = false)
    List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.nombre_categoria = categoria;
        this.activo = activo;
    }

}
