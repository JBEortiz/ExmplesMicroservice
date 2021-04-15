package com.example.formacion.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.formacion.item.entity.Item;
import com.example.formacion.item.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	@Qualifier("itemFeing")
	private ItemService service;
	
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return service.findAll();
		
	}
	
	
    @GetMapping("/listar/{id}")
	public Item deatelle(@PathVariable Long id){
		return service.findByIdl(id);
		
	}
	

	@GetMapping("/listar/{id}/cantidad/{cantidad}")
	public Item total(@PathVariable Long id, @PathVariable Integer cantidad){
		return service.getTotal(id, cantidad);
		
	}

}
