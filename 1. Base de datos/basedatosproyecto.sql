USE basedatosproyecto;

CREATE TABLE Clientes (
    ID INT PRIMARY KEY,
    nombre VARCHAR(50),
    direccion VARCHAR(100),
    email VARCHAR(50),
    telefono VARCHAR(15),
    formapago VARCHAR(20)
);


INSERT INTO Clientes (ID, nombre, direccion, email, telefono, FormaPago)
VALUES
(1, 'Cliente1', 'Direccion1', 'cliente1@example.com', '1234567890', 'Efectivo'),
(2, 'Cliente2', 'Direccion2', 'cliente2@example.com', '2345678901', 'Tarjeta'),
(3, 'Cliente3', 'Direccion3', 'cliente3@example.com', '3456789012', 'Transferencia'),
(4, 'Cliente4', 'Direccion4', 'cliente4@example.com', '4567890123', 'Efectivo'),
(5, 'Cliente5', 'Direccion5', 'cliente5@example.com', '5678901234', 'Tarjeta'),
(6, 'Cliente6', 'Direccion6', 'cliente6@example.com', '6789012345', 'Efectivo'),
(7, 'Cliente7', 'Direccion7', 'cliente7@example.com', '7890123456', 'Transferencia'),
(8, 'Cliente8', 'Direccion8', 'cliente8@example.com', '8901234567', 'Efectivo'),
(9, 'Cliente9', 'Direccion9', 'cliente9@example.com', '9012345678', 'Tarjeta'),
(10, 'Cliente10', 'Direccion10', 'cliente10@example.com', '0123456789', 'Efectivo');


CREATE TABLE Pedidos (
    NumeroPedido INT PRIMARY KEY,
    ClienteID INT,
    producto VARCHAR(50),
    FOREIGN KEY (ClienteID) REFERENCES Clientes(ID)
);

INSERT INTO Pedidos (NumeroPedido, ClienteID, Producto)
VALUES
(1, 1, 'Producto1'),
(2, 2, 'Producto2'),
(3, 3, 'Producto3'),
(4, 4, 'Producto4'),
(5, 5, 'Producto5'),
(6, 6, 'Producto6'),
(7, 7, 'Producto7'),
(8, 8, 'Producto8'),
(9, 9, 'Producto9'),
(10, 10, 'Producto10');


CREATE TABLE Administrador (
    NombreAdmon VARCHAR(50),
    Email VARCHAR(50)
);

INSERT INTO Administrador (NombreAdmon, Email)
VALUES ('Administrador1', 'admin@example.com');

CREATE TABLE Colaborador (
    NombreColaborador VARCHAR(50),
    Email VARCHAR(50)
);

INSERT INTO Colaborador (NombreColaborador, Email)
VALUES
('Colaborador1', 'colaborador1@example.com'),
('Colaborador2', 'colaborador2@example.com'),
('Colaborador3', 'colaborador3@example.com'),
('Colaborador4', 'colaborador4@example.com'),
('Colaborador5', 'colaborador5@example.com');