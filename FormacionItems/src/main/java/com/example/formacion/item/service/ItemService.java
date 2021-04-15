package com.example.formacion.item.service;

import java.util.List;

import com.example.formacion.item.entity.Item;

public interface ItemService {
	
	public List<Item> findAll();
	
	public Item findByIdl(Long id);
	
	public Item getTotal(Long id, Integer Cantidad);


}
