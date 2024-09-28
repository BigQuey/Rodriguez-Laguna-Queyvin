create database BD1_Apellido;
use BD1_Apellido;
create table clientes (
id_cliente int primary key,
nombre varchar(50),
direccion varchar(120)
);

insert into clientes(id_cliente,nombre,direccion)
values (1,'Juan Alberto','example'),
(2,'Maria Juana','example1'),
(3,'Pedro Sanchez','example2');

Create Table productos(
id_prod int primary key,
nom_prod varchar(50),
precio double,
stock_actual varchar(50)
);
insert into productos(id_prod,nom_prod,precio,stock_actual)
values (1,'Pasta',14,100),
(2,'Cereal',15,40),
(3,'Aceite',18,30);

Create Table factura (
id_cliente int,
nro_factura int auto_increment primary key,
fecha date,
estado varchar(50),
foreign key(id_cliente) references clientes(id_cliente),
total double
);
create Table detallefact(
nro_factura int,
id_prod int,
foreign key(nro_factura) references factura(nro_factura),
foreign key(id_prod) references productos(id_prod),
cantidad int,
primary key(nro_factura, id_prod)
)

