package org.bedu.project.service;


import org.bedu.project.dto.ProductoDTO;
import org.bedu.project.mapper.ProductoMapper;
import org.bedu.project.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    @Autowired
    private ProductoMapper mapper;
    public List<ProductoDTO>findAll() {
        return repository.findAll().stream().map(mapper::toDTO).toList();
    }










}
