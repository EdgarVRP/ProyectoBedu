package org.bedu.project.repository;


import org.bedu.project.model.ProductosVendidos;
import org.bedu.project.model.ProductosVendidosKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosVendidosRepository extends JpaRepository <ProductosVendidos, ProductosVendidosKey> {
}
