package org.bedu.project.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductoDTO {

    private String nombre;
    private String categoria;
    private String marca;
    private BigDecimal precio;
    private int stock;
}
