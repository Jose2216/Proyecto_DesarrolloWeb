package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "Producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    private String nombre;
    private String descripcion;
    private double precio;
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_PSerie")
    private PopularSeries PSerie;

    public Producto() {
    }

    public Producto(String producto, boolean activo) {
        this.nombre = producto;
        this.activo = activo;
    }

}
