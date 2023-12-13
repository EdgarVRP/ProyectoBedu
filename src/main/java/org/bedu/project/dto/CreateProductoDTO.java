package org.bedu.project.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class CreateProductoDTO {

    @NotBlank (message = "Ponga el nombre de producto")
    private String nombre;
    @NotBlank (message = "Ponga el cateogira de producto")
    private String categoria;
    @NotBlank (message = "Ponga la marca de producto")
    private String marca;
    private double precio;
    private int stock;


}
