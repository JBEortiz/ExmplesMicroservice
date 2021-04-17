package com.example.formacion.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formacion.productos.entity.Producto;
import com.example.formacion.productos.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void create(Producto producto) {
		repository.save(producto);
	}

	@Override
	public List<Producto> findAll() {
		return repository.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void update(Producto producto) {
		Producto productoUpdate = repository.findById(producto.getId()).get();
		if(productoUpdate!=null) {
			productoUpdate.setNombre(producto.getNombre());
			productoUpdate.setPrecio(producto.getPrecio());
		}
		
		
	}

}
