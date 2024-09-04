package com.example.demo.service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicee {
    @Autowired
    private Repository repository;

    public Model buscarPorData(String data) {
        return repository.findById(data).orElse(null);
    }

    public List<Model> listar() {
        return repository.findAll();
    }

    public Model add(){
    }
}
