package org.bedu.project.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class CreateProductoDTO {

    @NotBlank (message = "Ponga su nombre")
    private String nombre;
    private String categoria;
    private String marca;
    private BigDecimal precio;
    private int stock;


}
