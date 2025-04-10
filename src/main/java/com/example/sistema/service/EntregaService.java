package com.example.sistema.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {

    private final List<EntregaStrategy> entregaCusto;
    private final List<Notificador> notificadores;

    public EntregaService(List<EntregaStrategy> entregaCusto, List<Notificador> notificadores) {
        this.entregaCusto = entregaCusto;
        this.notificadores = notificadores;
    }

    public double calcular(String modalidade, double peso) {
        double valor = entregaCusto.stream()
                .filter(e -> e.modalidade().equalsIgnoreCase(modalidade))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Modalidade de entrega não encontrada"))
                .calcular(peso);

        // Notificar observadores
        String mensagem = "Entrega concluída: Modalidade (" + modalidade + "), Peso (" + peso + "kg), Valor R$: " + valor;
        notificadores.forEach(notificador -> notificador.notificar(mensagem));

        return valor;
    }
}
