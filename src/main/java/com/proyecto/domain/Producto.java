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
    private String rutaImagen;

    @ManyToOne 
    @JoinColumn(name = "id_categoria")
    Categoria categoria;
    
    @ManyToOne 
    @JoinColumn(name = "id_PSerie")
    PopularSeries pSerie;
    

    public Producto() {
    }
}