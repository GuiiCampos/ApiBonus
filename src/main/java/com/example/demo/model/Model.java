package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rollovers")
public class Model {

    @Id
    @Column(name = "data", nullable = false, unique = true)
    private String data;

    @Column(name = "ganhos")
    private int ganhos;
    @Column(name = "percas")
    private int percas;

    public Model() {
    }
    public Model(String data, int ganhos, int percas) {
        this.data = data;
        this.ganhos = ganhos;
        this.percas = percas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getGanhos() {
        return ganhos;
    }

    public void setGanhos(int ganhos) {
        this.ganhos = ganhos;
    }

    public int getPercas() {
        return percas;
    }

    public void setPercas(int percas) {
        this.percas = percas;
    }
}
