package com.devsuperior.dsvendas.controllers;

import java.util.List;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.services.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<List<Sale>> findAll(){
        List<Sale> sales = service.findAll();

        return ResponseEntity.ok().body(sales);
    }
}
