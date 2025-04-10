package com.example.sistema.service;

import org.springframework.stereotype.Component;

@Component
public class NotificadorCliente implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando cliente: " + mensagem);
    }
}