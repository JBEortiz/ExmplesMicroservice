package com.example.formacion.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.formacion.item.entity.Producto;
/*
 * Esta clase se define que un cliente fein 
 * el name se introduce el micro que queremos insertar
 * el nombre del proyecto del properties y la url
 */
@FeignClient(name = "FormacionProductos", url="localhost:8001")
public interface ProductoClienteRest {
	
	/*
	 * En el controlador lo utilizamos para mapear
	 * los metodos hanlerd a enpoins a rutas URL
	 * 
	 * mientras que en el Feing clien indicamos 
	 * la rutas del enpoin para consumir el servicio
	 * de la api y optener los datos jackson para introducir en nuestros objetos
	 * 
	 */
	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/listar/{id}")
	public Producto findById(@PathVariable Long id);
	
	@GetMapping("/listar/{id}/cantidad/{cantidad}")
	public Producto getTotal(@PathVariable Long id, @PathVariable Integer cantidad);

}
