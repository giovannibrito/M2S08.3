package com.example.exercicio5.controller;

import com.example.exercicio5.models.Conta;
import com.example.exercicio5.repository.ContaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/conta")
@RestController
public class ContaController {

    @GetMapping
    public ArrayList<Conta> listarContas(){
        return ContaRepository.getContas();
    }

    @GetMapping("/{id}")
    public Conta listarConta(@PathVariable int id){
        return ContaRepository.buscarConta(id);
    }

    @PostMapping
    public void criarConta(@RequestBody Conta conta){
        ContaRepository.adicionarConta(conta);
    }
    @DeleteMapping("/{id}")
    public void excluirConta(@PathVariable int id){
        ContaRepository.excluirConta(id);
    }
}
