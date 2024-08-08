
package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private String status;

    @ManyToOne 
    @JoinColumn(name = "id_categoria")
    Categoria categoria;

    public Producto() {
    }

}
