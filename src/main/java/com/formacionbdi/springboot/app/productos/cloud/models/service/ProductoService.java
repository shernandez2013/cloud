package com.formacionbdi.springboot.app.productos.cloud.models.service;

import com.formacionbdi.springboot.app.productos.cloud.models.entity.Producto;

import java.util.List;


public interface ProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);
}
