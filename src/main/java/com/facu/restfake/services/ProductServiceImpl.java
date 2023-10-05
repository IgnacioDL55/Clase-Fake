package com.facu.restfake.services;


import com.facu.restfake.entities.Product;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Product> buscarPorPrecioMayorA0(Double precioMinimo) throws Exception {
        try {
            List<Product> products = productoRepository.buscarPorPrecioMayorA0(precioMinimo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public List<Product> buscarPorPrecioMayorA1(Double precioMinimo) throws Exception {
        try {
            List<Product> products = productoRepository.buscarPorPrecioMayorA1(precioMinimo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Product> buscarPorPrecioEntre0(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Product> products = productoRepository.buscarPorPrecioEntre0(precioMinimo, precioMaximo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public List<Product> buscarPorPrecioEntre1(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Product> products = productoRepository.buscarPorPrecioEntre1(precioMinimo, precioMaximo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}