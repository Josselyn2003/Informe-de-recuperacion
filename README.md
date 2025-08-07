# 📘 Proyecto Supletorio – Programación en Java

Este repositorio contiene las dos actividades requeridas para aprobar el supletorio de la materia **Programación en Java**. Se trabajó con Java, utilizando tanto interfaz gráfica como consola, aplicando conceptos fundamentales como programación orientada a objetos, conexión con bases de datos y uso de listas dinámicas.

---

## ✅ Actividad 1 – CRUD de Películas (Java Swing + MySQL)

### 🎯 Descripción
Sistema que permite gestionar un listado de películas mediante una **interfaz gráfica creada con Java Swing**. Los datos se almacenan en una base de datos **MySQL local**.

### 📋 Funcionalidades
- Registrar películas con:
  - Nombre de la película
  - Género: Terror, Comedia, Drama o Acción
  - Si es apta para todo público
- Consultar todas las películas registradas
- Modificar películas existentes
- Eliminar películas del sistema
- Visualización y actualización directa desde la base de datos

### 🛠️ Tecnologías usadas
- Java 17
- Java Swing
- MySQL Workbench
- JDBC (MySQL Connector/J)
- IntelliJ IDEA

### 💾 Base de Datos

Nombre: `cine_db`  
Tabla: `peliculas`

```sql
CREATE DATABASE cine_db;

USE cine_db;

CREATE TABLE peliculas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100),
  genero ENUM('Terror', 'Comedia', 'Drama', 'Accion'),
  apta_para_todo_publico BOOLEAN
);

