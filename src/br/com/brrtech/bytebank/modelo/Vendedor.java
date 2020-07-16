package br.com.brrtech.bytebank.modelo;

import java.time.LocalDate;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, int matricula, LocalDate dataNascimento) {
        super(nome, matricula, dataNascimento);
    }

}
