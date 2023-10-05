package com.facu.restfake.services;


import com.facu.restfake.entities.Product;

import java.util.List;


public interface ProductoService extends BaseService<Product,Long> {

    List<Product> buscarPorPrecioMayorA0(Double precioMinimo) throws Exception;
    List<Product> buscarPorPrecioMayorA1(Double precioMinimo) throws Exception;

    List<Product> buscarPorPrecioEntre0(Double precioMinimo, Double precioMaximo) throws Exception;
    List<Product> buscarPorPrecioEntre1(Double precioMinimo, Double precioMaximo) throws Exception;

}



