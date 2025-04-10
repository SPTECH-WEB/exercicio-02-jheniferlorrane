package com.example.sistema.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements EntregaStrategy {

    @Override
    public Double calcular (Double peso) {
        return peso * 1.5 + 7.0;
    }

    @Override
    public String modalidade() {
        return "Expressa";
    }
}
