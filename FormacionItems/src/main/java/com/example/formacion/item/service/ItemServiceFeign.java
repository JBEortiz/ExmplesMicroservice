package com.example.formacion.item.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.formacion.item.clientes.ProductoClienteRest;
import com.example.formacion.item.entity.Item;
@Service("itemFeing")
@Primary
public class ItemServiceFeign implements ItemService {

	@Autowired 
	private ProductoClienteRest clientRest;
	
	@Override
	public List<Item> findAll() {
		int cantidad=2;
		return clientRest.listar().stream().map(p-> new Item(p,cantidad,p.getPrecio()*cantidad)).collect(Collectors.toList());
	}

	public Item findByIdl(Long id) {
		return new Item(clientRest.findById(id),3,3*clientRest.findById(id).getPrecio());
	}

	@Override
	public Item getTotal(Long id, Integer cantidad) {
		return new Item(clientRest.findById(id),cantidad, clientRest.findById(id).getPrecio()*cantidad);
	}

}
