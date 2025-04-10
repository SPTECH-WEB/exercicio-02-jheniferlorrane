package com.example.sistema.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements EntregaStrategy {

    @Override
    public Double calcular(Double peso) {
        return peso + 7.0;
    }

    @Override
    public String modalidade() {
        return "Economica";
    }
}
