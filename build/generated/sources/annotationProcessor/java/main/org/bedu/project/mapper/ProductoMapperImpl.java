package org.bedu.project.mapper;

import javax.annotation.processing.Generated;
import org.bedu.project.dto.ProductoDTO;
import org.bedu.project.model.Producto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T18:22:43-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.8.1 (Amazon.com Inc.)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public ProductoDTO toDTO(Producto model) {
        if ( model == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setId( model.getId() );
        productoDTO.setNombre( model.getNombre() );
        productoDTO.setCategoria( model.getCategoria() );
        productoDTO.setMarca( model.getMarca() );
        productoDTO.setPrecio( model.getPrecio() );
        productoDTO.setStock( model.getStock() );

        return productoDTO;
    }
}
