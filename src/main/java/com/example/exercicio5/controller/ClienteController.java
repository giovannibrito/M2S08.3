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
}
