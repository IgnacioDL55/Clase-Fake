package com.facu.restfake.repositories;

import com.facu.restfake.entities.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
@Repository
public interface ProductoRepository extends BaseRepository<Product, Long>{
    @Query("SELECT p FROM Product p WHERE p.price > :precioMinimo")
    List<Product> buscarPorPrecioMayorA0(@Param("precioMinimo") Double precioMinimo);

    @Query(value = "SELECT * FROM Product as p WHERE p.precio_compra > :precioMinimo", nativeQuery = true)
    List<Product> buscarPorPrecioMayorA1(@Param("precioMinimo") Double precioMinimo);


    @Query("SELECT p FROM Product p WHERE p.price > :precioMinimo AND p.price < :precioMaximo")
    List<Product> buscarPorPrecioEntre0(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);

    @Query(value = "SELECT * FROM Product as p WHERE p.precio_compra > :precioMinimo AND p.precio_compra < :precioMaximo", nativeQuery = true)
    List<Product> buscarPorPrecioEntre1(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);




}
