package org.bedu.project.service;

import java.util.List;

import org.bedu.project.model.VentaEntity;
import org.bedu.project.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    private final VentaRepository ventaRepository;

    @Autowired
    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    // Save a venta
    public VentaEntity save(VentaEntity venta) {
        return ventaRepository.save(venta);
    }

    // Get all ventas
    public List<VentaEntity> getAll() {
        return ventaRepository.findAll();
    }

    // Get a venta by id
    public VentaEntity getById(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    // Delete a venta by id
    public void deleteById(Long id) {
        ventaRepository.deleteById(id);
    }

    // Update a venta by id
    public VentaEntity updateById(VentaEntity venta, Long id) {
        VentaEntity ventaEntity = ventaRepository.findById(id).orElse(null);
        if (venta.getFecha() != null) {
            ventaEntity.setFecha(venta.getFecha());
        }
        if (venta.getCantidad() != null) {
            ventaEntity.setCantidad(venta.getCantidad());
        }
        if (venta.getIdproducto() != null) {
            ventaEntity.setIdproducto(venta.getIdproducto());
        }
        ventaRepository.save(ventaEntity);
        return ventaEntity;
    }
}
