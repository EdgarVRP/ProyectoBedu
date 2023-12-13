CREATE TABLE ventas_bedu (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE NOT NULL,
    cantidad INT NOT NULL CHECK (cantidad >= 1),
    idProducto BIGINT NOT NULL
);

-- Insertar datos de muestra en la tabla Ventas_

INSERT INTO ventas_bedu (fecha, cantidad, idProducto) VALUES ('2023-01-01', 10, 1);
INSERT INTO ventas_bedu (fecha, cantidad, idProducto) VALUES ('2023-02-15', 5, 2);
INSERT INTO ventas_bedu (fecha, cantidad, idProducto) VALUES ('2023-03-20', 8, 3);
INSERT INTO ventas_bedu (fecha, cantidad, idProducto) VALUES ('2023-04-05', 12, 4);
INSERT INTO ventas_bedu (fecha, cantidad, idProducto) VALUES ('2023-05-10', 15, 5);
