package org.bedu.project.controller;

import org.bedu.project.dto.GenericResponseDTO;
import org.bedu.project.model.VentaEntity;
import org.bedu.project.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
@CrossOrigin(origins = { "*" })
public class VentaController {
    @Autowired
    private VentaService servicio;

    // Get all ventas
    @GetMapping("/all")
    public ResponseEntity<?> listAllVentas() {
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.getAll()));
    }

    // Get a venta by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getVentaById(@PathVariable Long id) {
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.getById(id)));
    }

    // POST a venta
    @PostMapping("/save")
    public ResponseEntity<?> saveVenta(@RequestBody VentaEntity venta) {
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.save(venta)));
    }

    // update venta
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<?> updateVenta(@RequestBody VentaEntity venta, @PathVariable Long id) {
        // Mostrando lo que se recibe
        System.out.println(venta);
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", servicio.updateById(venta, id)));
    }

    // delete venta
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteVenta(@PathVariable Long id) {
        servicio.deleteById(id);
        return ResponseEntity.ok()
                .body(new GenericResponseDTO<>(true, "FULL", "Venta eliminada"));
    }

}
