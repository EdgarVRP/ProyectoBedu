package org.bedu.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ventas_bedu")
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "cantidad", nullable = false)
    @Min(value = 1)
    private Integer cantidad;

    @Column(name = "idproducto", nullable = false)
    private Long idproducto;

}
