package org.bedu.project.mapper;

import org.bedu.project.dto.ProductoDTO;
import org.bedu.project.model.Producto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface ProductoMapper {
    ProductoDTO toDTO(Producto model);
}
