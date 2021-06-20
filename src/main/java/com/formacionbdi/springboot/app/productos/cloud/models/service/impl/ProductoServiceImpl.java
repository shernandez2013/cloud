package com.formacionbdi.springboot.app.productos.cloud.models.service.impl;

import com.formacionbdi.springboot.app.productos.cloud.models.dao.ProductoDao;
import com.formacionbdi.springboot.app.productos.cloud.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.cloud.models.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoDao productoDao;


    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
}
