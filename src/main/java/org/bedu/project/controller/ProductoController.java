package org.bedu.project.controller;

import jakarta.validation.Valid;
import org.bedu.project.dto.CreateProductoDTO;
import org.bedu.project.dto.ProductoDTO;
import org.bedu.project.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class ProductoController {
    @Autowired
    private ProductoService servicio;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoDTO> findAll() {
        return servicio.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoDTO save(@Valid @RequestBody CreateProductoDTO data) {
        return servicio.save(data);



}







}
