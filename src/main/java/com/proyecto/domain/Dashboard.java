
package com.proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;


@Data
@Entity
@Table(name = "Venta")
public class Dashboard implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private int idVenta;
    
    @Column(name = "fecha_venta")
    private LocalDate fechaVenta;
    
    @Column(name = "total")
    private Double total;
    
    @ManyToOne
    @JoinColumn(name = "id_factura")
    private Factura factura;
    
    public Dashboard() {}

    public Dashboard(int idVenta, LocalDate fechaVenta, Double total, Factura factura) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.factura = factura;
    }
}