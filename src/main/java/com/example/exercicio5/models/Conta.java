package com.example.exercicio5.models;

import lombok.Getter;

public class Conta {
    @Getter
    private int id;
    @Getter
    private Cliente cliente;
    private double saldo;

    public Conta(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
}
