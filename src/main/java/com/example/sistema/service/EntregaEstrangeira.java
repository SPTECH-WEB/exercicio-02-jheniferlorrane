package com.example.sistema.service;

import org.springframework.stereotype.Component;

@Component("entregaEstrangeira")
public class EntregaEstrangeira {

    public Double calcularEntregaEstrangeira(Double peso) {
        return peso * 1.8 + 5;
    }

    public String modalidade() {
        return "Entrega Estrangeira";
    }
}
