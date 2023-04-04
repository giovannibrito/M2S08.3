package com.example.exercicio5.handler;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespostaErro {
    private String mensagem;
    private String exception;

    public RespostaErro( String exception) {
        this.exception = exception;
    }
}