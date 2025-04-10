package com.example.sistema.service;

import org.springframework.stereotype.Component;

@Component
public class NotificadorEquipe implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando equipe interna: " + mensagem);
    }
}
