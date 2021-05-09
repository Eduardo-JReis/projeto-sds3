package com.devsuperior.dsvendas.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class VendasResource {
    
    @GetMapping
    public List<String> listar(){
        List list = Arrays.asList("teste1", "teste2", "teste3");

        return list;
    }
}
