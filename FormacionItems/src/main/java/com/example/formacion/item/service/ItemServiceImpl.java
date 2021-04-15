package com.example.formacion.item.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.formacion.item.entity.Item;
import com.example.formacion.item.entity.Producto;
@Service
public class ItemServiceImpl implements ItemService{
	/*
	 * RestTemplate me da la posibilidad pedir una 
	 * URL y el tipo de objeto que va a recibir
	 * es decir la posibilidad de conectar microservicios pero deja demasiado acoplado en la aplicacion 
	 * la direccion CONOCER BASE
	 */
	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> findAll() {
		int cantiad=3;
		List<Producto> productos= Arrays.asList(clienteRest.getForObject("http://localhost:8001/listar", Producto[].class));
		List<Item> items=productos.stream().map(p-> new Item(p,cantiad,p.getPrecio()*cantiad)).collect(Collectors.toList());
		for (Item item : items) {
			if(item.getTotal()==null) {
				item.setTotal(item.getProducto().getPrecio());
			}
		}
		return items;
				
	}

	@Override
	public Item findByIdl(Long id,Integer cantidad) {
		Map<String,String> pathVariables = new HashMap<>();
		pathVariables.put("id",id.toString());
		Producto producto= clienteRest.getForObject("http://localhost:8001/listar/{id}", Producto.class,pathVariables);
		Item item=new Item(producto,cantidad);
		if(item.getTotal()==null) {
			item.setTotal(item.getProducto().getPrecio());
		}
		return item;
	}

	@Override
	public Item getTotal(Long id, Integer cantidad) {
		Map<String,String> pathVariables = new HashMap<>();
		pathVariables.put("id",id.toString());
		Producto producto= clienteRest.getForObject("http://localhost:8001/listar/{id}", Producto.class,pathVariables);
		return new Item(producto,cantidad,producto.getPrecio()*cantidad);
	}

	

}
