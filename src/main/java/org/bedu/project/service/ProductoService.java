package org.bedu.project.service;

import org.bedu.project.model.ProductoEntity;
import org.bedu.project.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Save a product
    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }

    // Get all products
    public List<ProductoEntity> getAll() {
        System.out.println("getAllProducts() called");
        System.out.println(productoRepository.findAll());
        return productoRepository.findAll();
    }

    // Get a product by id
    public ProductoEntity getById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    // Delete a product by id
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }

    // Update a product by id
    public ProductoEntity updateById(ProductoEntity producto, Long id) {
        ProductoEntity productoEntity = productoRepository.findById(id).orElse(null);
        if (producto.getNombre() != null) {
            productoEntity.setNombre(producto.getNombre());
        }
        if (producto.getCategoria() != null) {
            productoEntity.setCategoria(producto.getCategoria());
        }
        if (producto.getMarca() != null) {
            productoEntity.setMarca(producto.getMarca());
        }
        if (producto.getPrecio() != null) {
            productoEntity.setPrecio(producto.getPrecio());
        }
        if (producto.getStock() != null) {
            productoEntity.setStock(producto.getStock());
        }

        productoRepository.save(productoEntity);
        return productoEntity;
    }

}
