package com.example.demo.controller;

import com.example.demo.model.Model;
import com.example.demo.service.Servicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/ganhos")
public class Controller {

    @Autowired
    private Servicee service;

    @GetMapping("/{data}")
    public Model get(@PathVariable String data){
        return service.buscarPorData(data);
    }

    @GetMapping
    public List<Model> getAll(){
        return service.listar();
    }
}
