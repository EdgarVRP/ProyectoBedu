CREATE TABLE inventario_bedu2 (
    Id INT PRIMARY KEY,
    Nombre VARCHAR(255),
    Categoria VARCHAR(255),
    Marca VARCHAR(255),
    Precio DECIMAL(10, 2),
    Stock INT
);

-- Ejemplo 1
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (1, 'Producto1', 'Electrónicos', 'MarcaA', 299.99, 50);

-- Ejemplo 2
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (2, 'Producto2', 'Ropa', 'MarcaB', 39.99, 100);

-- Ejemplo 3
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (3, 'Producto3', 'Hogar', 'MarcaC', 149.50, 30);

-- Ejemplo 4
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (4, 'Producto4', 'Electrónicos', 'MarcaA', 499.99, 20);

-- Ejemplo 5
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (5, 'Producto5', 'Ropa', 'MarcaB', 29.99, 80);

-- Ejemplo 6
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (6, 'Producto6', 'Hogar', 'MarcaC', 199.75, 25);

-- Ejemplo 7
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (7, 'Producto7', 'Electrónicos', 'MarcaA', 899.99, 15);

-- Ejemplo 8
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (8, 'Producto8', 'Ropa', 'MarcaB', 49.99, 60);

-- Ejemplo 9
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (9, 'Producto9', 'Hogar', 'MarcaC', 99.95, 40);

-- Ejemplo 10
INSERT INTO inventario_bedu2 (Id, Nombre, Categoria, Marca, Precio, Stock)
VALUES (10, 'Producto10', 'Electrónicos', 'MarcaA', 349.99, 10);
