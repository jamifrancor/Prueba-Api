Create Database DB_ApiLogin
use DB_ApiLogin


Create Table Usuarios(
IdUsuario Integer not null,
UserName Varchar(50) not null,
Password Varchar(50) not null,
mail Varchar(50) not null,
SessionActivate Char(1) not null,
Persona_IdPersona2 Integer not null,
Usuario_IdUsuario Integer not null,
Status Char(20) not null,
primary key(IdUsuario),
)

Create Table Persona(
IdPersona Integer not null,
Nombre Varchar(60) not null,
Apellido Varchar(60) not null,
Cédula Varchar(10) not null,
Fecha_nacimiento Date not null,
primary key(IdPersona),
)

Create Table Seccion(
Fecha_ingreso Date not null,
Fecha_cierre Date not null,
Usuario_IdUsuario Integer not null,
)


Create Table Rol_Usuario(
Rol_IdRol Integer  not null,
usuarios_IdUsuario Integer not null,
primary key(Rol_IdRol, usuarios_IdUsuario),
)

Create Table Rol(
IdRol Integer  not null,
Rol_nombre Varchar(50) not null,
primary key(IdRol),
)

Create Table RolOpciones(
IdOpcion Integer not null,
NombreOpcion Varchar(50) not null,
primary key(IdOpcion),
)

Create Table Rol_RolOpciones(
Rol_IdRol Integer not null,
RolOpciones_IdOpcion Integer not null,
primary key(Rol_IdRol,RolOpciones_IdOpcion),
)




