package com.example.exercicio5.repository;

import com.example.exercicio5.models.Cliente;
import com.example.exercicio5.models.Conta;

import java.util.ArrayList;
import java.util.Optional;

public class ClienteRepository {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public static ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public static Cliente buscarCliente(int id){
        Optional<Cliente> cliente = clientes.stream().filter(c -> c.getId() == id ).findAny();
        return cliente.orElse(null);
    }
    public static void excluirCliente(int id) {
        clientes.remove(buscarCliente(id));
    }
    public static void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

}
