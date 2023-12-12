package org.bedu.project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Productos_vendidos")
public class ProductosVendidos {

    @EmbeddedId
    private  ProductosVendidosKey id;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "product_id")
    private Producto producto;

    @ManyToOne
    @MapsId("ventaId")
    @JoinColumn(name = "venta_id)")
    private Venta venta;



}
