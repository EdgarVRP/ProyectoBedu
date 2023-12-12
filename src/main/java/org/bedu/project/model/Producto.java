package org.bedu.project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (length = 100, nullable = false)
    private String nombre;

    @Column (length = 100, nullable = false)
    private String categoria;

    @Column (length = 100, nullable = false)
    private String marca;

    private double precio;
    private int stock;


}
