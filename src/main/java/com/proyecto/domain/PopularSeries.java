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
@Table(name = "popularseries")
public class PopularSeries implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_PSerie")
    private long idPSerie;
    private String nombre;
    private String rutaImagen;
    private boolean activo;
    @OneToMany
    @JoinColumn(name = "id_PSerie", updatable = false)
    List<Producto> productos;

    public PopularSeries() {
    }

    public PopularSeries(String PSerie, boolean activo) {
        this.nombre = PSerie;
        this.activo = activo;
    }

}
