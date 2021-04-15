package com.example.formacion.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.formacion.productos.entity.Producto;
import com.example.formacion.productos.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return service.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Producto findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	

}
