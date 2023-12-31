package org.bedu.project.controller;

import org.bedu.project.dto.GenericResponseDTO;
import org.bedu.project.model.ProductoEntity;
import org.bedu.project.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = { "*" })
public class ProductoController {
    @Autowired
    private ProductoService servicio;

    // Get all products
    @GetMapping("/all")
    public ResponseEntity<?> listAllProducts() {
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.getAll()));
    }

    // Get a product by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.getById(id)));
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveProduct(@RequestBody ProductoEntity producto) {
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.save(producto)));
    }

    // update product
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody ProductoEntity producto, @PathVariable Long id) {
        // Mostrando lo que se recibe
        System.out.println(producto);
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.updateById(producto, id)));
    }

    // delete product
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        servicio.deleteById(id);
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", "Producto eliminado"));
    }

}
