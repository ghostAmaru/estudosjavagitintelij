package br.com.brrtech.bytebank.modelo;

import java.time.LocalDate;

public class Atendente extends Funcionario{

    public Atendente(String nome, int matricula, LocalDate dataNascimento) {
        super(nome, matricula, dataNascimento);
    }

}
