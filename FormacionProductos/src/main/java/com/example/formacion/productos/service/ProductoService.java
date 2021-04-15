package com.example.formacion.productos.service;

import java.util.List;

import com.example.formacion.productos.entity.Producto;

public interface ProductoService {

	public void create(Producto producto);

	public List<Producto> findAll();

	public Producto findById(Long id);

	public void delete(Long id);

	public void update(Producto producto);
}
