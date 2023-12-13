package org.bedu.project.controller;

import org.bedu.project.dto.ProductoDTO;
import org.bedu.project.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("productos")
public class ProductoController {
    @Autowired
    private ProductoService servicio;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoDTO> findAll(){
        return servicio.findAll();


    }



}
