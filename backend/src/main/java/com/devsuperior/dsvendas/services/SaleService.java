package com.devsuperior.dsvendas.services;

import java.util.List;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;

    public List<Sale> findAll(){
        List<Sale> sales = repository.findAll();

        return sales;
    }
}
