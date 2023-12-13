package org.bedu.project.repository;

import java.util.List;

import org.bedu.project.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.protobuf.Option;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
}
