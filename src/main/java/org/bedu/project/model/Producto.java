package org.bedu.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    private String nombre;
    private String categoria;
    private String x;




}
