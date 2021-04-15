package com.example.formacion.item.entity;

public class Item {

	private Producto producto;
	private Integer cantidad;
	private Double total;

	public Item(Producto producto, Integer cantidad, Double total) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.total=total;
	}

	public Item(Producto producto, Integer cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Item() {
		super();
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	

}
