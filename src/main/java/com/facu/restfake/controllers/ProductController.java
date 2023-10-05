package com.facu.restfake.controllers;

import com.facu.restfake.entities.Product;
import com.facu.restfake.services.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "fakestoreapi.com/products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl> {

    @GetMapping("/mayor0")
    public ResponseEntity<?> buscarPorPrecioMayorA0(@RequestParam Double precioMinimo) {
        try {
            return  ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioMayorA0(precioMinimo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\"" + e.getMessage() +"\"}");
        }
    }
    @GetMapping("/mayor1")
    public ResponseEntity<?> buscarPorPrecioMayorA1(@RequestParam Double precioMinimo) {
        try {
            return  ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioMayorA1(precioMinimo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\"" + e.getMessage() +"\"}");
        }
    }

    @GetMapping("/entre0")
    public ResponseEntity<?> buscarPorPrecioEntre0(@RequestParam Double precioMinimo, @RequestParam Double precioMaximo) {
        try {
            return  ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioEntre0(precioMinimo, precioMaximo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\"" + e.getMessage() +"\"}");
        }
    }
    @GetMapping("/entre1")
    public ResponseEntity<?> buscarPorPrecioEntre1(@RequestParam Double precioMinimo, @RequestParam Double precioMaximo) {
        try {
            return  ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioEntre1(precioMinimo, precioMaximo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\"" + e.getMessage() +"\"}");
        }
    }

}