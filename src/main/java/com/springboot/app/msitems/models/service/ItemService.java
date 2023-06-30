package com.springboot.app.msitems.models.service;

import java.util.List;

import com.springboot.app.msitems.models.Item;
import com.springboot.app.msitems.models.Producto;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	public Producto save(Producto producto);
	public Producto update(Producto producto, Long id);
	public void deleteById(Long id);
}
