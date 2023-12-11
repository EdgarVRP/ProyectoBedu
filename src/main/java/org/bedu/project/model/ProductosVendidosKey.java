package org.bedu.project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class ProductosVendidosKey {
    @Column(name = "venta id")
    private long ventaId;
    @Column(name = "producto id")
    private long productoId;
}
