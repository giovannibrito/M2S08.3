package com.example.exercicio5.repository;

import com.example.exercicio5.models.Conta;

import java.util.ArrayList;
import java.util.Optional;

public class ContaRepository {
    static ArrayList<Conta> contas = new ArrayList<>();

    public static Conta buscarConta(int id){
        Optional<Conta> conta = contas.stream().filter(cnt -> cnt.getId() == id).findAny();
        return conta.orElse(null);
    }
    public static void excluirConta(int id){
        contas.remove(buscarConta(id));
    }

    public static void adicionarConta(Conta conta){
        contas.add(conta);
    }

}
