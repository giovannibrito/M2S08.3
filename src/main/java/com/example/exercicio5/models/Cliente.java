package com.example.exercicio5.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
public class Cliente {
    int id;
    String nome;
    @CPF
    long cpf;
}
