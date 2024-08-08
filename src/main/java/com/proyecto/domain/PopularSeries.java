/*
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

@Data //se recolectan datos
@Entity //entidad de tabla
@Table(name = "PopularSeries")
public class PopularSeries implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_PSerie")
    private long idPSerie;
    private String nombre;
    private String rutaImagen;

    @OneToMany
    @JoinColumn(name = "id_PSerie")
    List<Producto> productos;

    public PopularSeries(String nombre, String rutaImagen) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
    }

}
*/