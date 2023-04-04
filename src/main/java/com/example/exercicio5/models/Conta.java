package com.example.exercicio5.models;

import com.example.exercicio5.repository.ContaRepository;
import lombok.Data;

import java.util.Objects;

@Data
public class Conta {
    private int id;
    private int cliente;
    private double saldo;

    public Conta(int id, int cliente) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
    public boolean sacar(double quantia){
        if (saldo >= quantia){
            saldo = saldo - quantia;
            return true;
        }
        else {
            return false;
        }
    }
    public void depositar(double quantia){
        saldo = saldo + quantia;
    }

    public boolean transferir(double quantia,int id_conta2){
        Conta conta2 = ContaRepository.buscarConta(id_conta2);
        if (saldo >= quantia && Objects.nonNull(conta2)){
            saldo = saldo - quantia;
            conta2.depositar(quantia);
            return true;
        } else return false;
    }
}
