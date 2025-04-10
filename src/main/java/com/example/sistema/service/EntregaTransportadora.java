package com.example.sistema.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaTransportadora implements EntregaStrategy {

    @Override
    public Double calcular (Double peso) {
        return peso * 2.0;
    }

    @Override
    public String modalidade() {
        return "Transportadora";
    }
}
