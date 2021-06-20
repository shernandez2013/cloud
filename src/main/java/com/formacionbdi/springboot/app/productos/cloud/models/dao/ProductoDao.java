package com.formacionbdi.springboot.app.productos.cloud.models.dao;

import com.formacionbdi.springboot.app.productos.cloud.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto,Long> {

}