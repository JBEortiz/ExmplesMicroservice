package com.example.formacion.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formacion.productos.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{


}
