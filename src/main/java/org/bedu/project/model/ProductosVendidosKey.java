package org.bedu.project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class ProductosVendidosKey {
    @Column(name = "venta_id")
    private long ventaId;
    @Column(name = "product_id")
    private long productoId;
}
