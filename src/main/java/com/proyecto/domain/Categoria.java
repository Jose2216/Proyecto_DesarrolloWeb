package com.proyecto.domain;

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
@Table(name = "Categoria")

public class Categoria implements Serializable { 

    private static final long serialVersionUID = 1L; 

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_categoria") 
    private long idCategoria;
    private String nombre;
    private String informacion;

    @OneToMany 
    @JoinColumn(name = "id_categoria")
    List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String descripcion) {
        this.nombre = nombre;
        this.informacion = informacion;
    }

    

}
