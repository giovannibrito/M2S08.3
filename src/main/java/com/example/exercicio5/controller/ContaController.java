package com.example.exercicio5.controller;

import com.example.exercicio5.models.Conta;
import com.example.exercicio5.models.Transferencia;
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
    @PutMapping("/{id}")
    public void depositar(@PathVariable int id, @RequestBody Transferencia transferencia){
        ContaRepository.buscarConta(id).depositar(transferencia.getValor());
    }
    @DeleteMapping("/{id}")
    public void excluirConta(@PathVariable int id){
        ContaRepository.excluirConta(id);
    }

    @PutMapping("/transfere")
    public String transferir(@RequestBody Transferencia transferencia){
        int id1 = transferencia.getId1();
        int id2 = transferencia.getId2();
        double valor = transferencia.getValor();

        ContaRepository.buscarConta(id1).transferir(valor,id2);

        return ContaRepository.buscarConta(id1).toString() + ContaRepository.buscarConta(id2).toString();
    }
}
