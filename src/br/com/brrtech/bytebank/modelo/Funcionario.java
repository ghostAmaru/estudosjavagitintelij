package br.com.brrtech.bytebank.modelo;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private int matricula;
    private LocalDate dataNascimento;
    private String usuario;
    private String senha;

    public Funcionario(String nome, int matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula = matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento = dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    /* Sem o método toString, quando for imprimir as informações devido ao encapsulamento será impresso o endereço original do objeto, e não as informações populadas
    * Caso você queria ver o resultado sem o toString comente o método abaixo e rode o código */
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
