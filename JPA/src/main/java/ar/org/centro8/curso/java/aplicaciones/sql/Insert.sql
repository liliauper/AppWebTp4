use negocioWebRopa;
LOCK TABLES `articulos` WRITE;
/*!40000 ALTER TABLE `articulos` DISABLE KEYS */;
INSERT INTO `articulos` VALUES 
(1,'Remera','ROPA','negro','large',15,10,50,100,120,'VERANO'),
(2,'Remera Lisa Jersey ','ROPA','azul','large',8,5,50,300,450,'OTOÑO'),
(3,'Chomba Pique ','ROPA','rojo','small',9,5,50,400,600,'OTOÑO'),
(4,'Musculosa Deportiva','ROPA','blanco','XXL',6,2,20,300,450,'VERANO'),
(5,'Remera Lisa Jersey','ROPA','negro','large',6,5,50,300,450,'OTOÑO'),
(6,'Remera Lisa Jersey','ROPA','negro','small',7,5,50,300,450,'OTOÑO'),
(7,'Chomba Pique','ROPA','azul','small',6,5,50,400,600,'OTOÑO'),
(8,'Remera Lisa Jersey','ROPA','rosa','XXL',7,5,50,300,450,'OTOÑO'),
(9,'Remera Lisa Jersey','ROPA','verde','small',7,5,50,300,450,'OTOÑO'),
(10,'Remera','ROPA','rojo','1',5,20,40,10,12,'VERANO');
/*!40000 ALTER TABLE `articulos` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES 
(1,'Fernando','Acme',34,'lima 222','intercrios@hotmail.com','23232312','DNI','12345678'),
(2,'Teofilo','GarciaLasca',43,'lima 222','lawlercarlospatricio@gmail.com','23232312','DNI','23567898'),
(3,'Coyote','Acme',34,'lima 222','c.rios@bue.edu.ar','23232312','DNI','12345679'),
(4,'Graciela','Meza',18,'lima 222','intercrios@hotmail.com','23232312','DNI','11111111'),
(5,'Juan ','Gomez',21,'medrano 165','gomez@gmail.com','33333333','DNI','88888888'),
(6,'Laura','Rojas',19,'medrano 165','rojas@gmail.com','77777777','DNI','77777777');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

insert into facturas (letra,numero,fecha,medioDePago,idCliente) values
('A',1,curdate(),'EFECTIVO',1);
insert into facturas (letra,numero,fecha,medioDePago,idCliente) values
('A',4,curdate(),'EFECTIVO',1);
insert into facturas (letra,numero,fecha,medioDePago,idCliente) values
('A',5,curdate(),'EFECTIVO',1);
insert into detalles (idArticulo,idFactura,precio,cantidad) values
(2,3,100,2);

insert into detalles (idArticulo,idFactura,precio,cantidad) values
(1,1,100,2),
(2,1,200,1);
select * from articulos;
select * from clientes;


