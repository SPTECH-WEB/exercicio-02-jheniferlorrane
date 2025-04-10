package com.example.sistema.service;

import org.springframework.stereotype.Service;

@Service("EntregaEstrangeira")
public class EntregaAdapter implements EntregaStrategy {

    private final EntregaEstrangeira entregaEstrangeira;

    public EntregaAdapter(){
        this.entregaEstrangeira = new EntregaEstrangeira();
    }

    @Override
    public String modalidade() {
        return "Entrega Estrangeira";
    }

    @Override
    public Double calcular(Double peso) {
        return entregaEstrangeira.calcularEntregaEstrangeira(peso);
    }
}
