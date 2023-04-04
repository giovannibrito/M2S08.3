package com.example.exercicio5.controller;

import com.example.exercicio5.models.Cliente;
import com.example.exercicio5.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/cliente")
@RestController
public class ClienteController {

    @GetMapping
    public ArrayList<Cliente> listarClientes(){
        return ClienteRepository.getClientes();
    }

    @GetMapping("/{id}")
    public Cliente listarCliente(@PathVariable Integer id){
        return ClienteRepository.buscarCliente(id);
    }

    @PostMapping
    public void criarCliente(@RequestBody Cliente cliente){
        ClienteRepository.adicionarCliente(cliente);
    }

    @PutMapping("/{id}")
    public void editarCliente(@RequestBody Cliente cliente, @PathVariable int id){
        ClienteRepository.buscarCliente(id).setNome(cliente.getNome());
        ClienteRepository.buscarCliente(id).setCpf(cliente.getCpf());
    }

    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable int id){
        ClienteRepository.excluirCliente(id);
    }
}
