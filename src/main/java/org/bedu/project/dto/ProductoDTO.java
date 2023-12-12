package org.bedu.project.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductoDTO {

    private long id;
    private String nombre;
    private String categoria;
    private String marca;
    private double precio;
    private int stock;

}
