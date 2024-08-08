
package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;


@Data
@Entity
@Table(name = "Factura")
public class Factura implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private int idFactura;
    
    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @OneToMany(mappedBy = "factura")
    private List<Dashboard> ventas;
    
    public Factura() {}

    public Factura(int idFactura, LocalDate fechaFactura, Cliente cliente) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
    }
}
