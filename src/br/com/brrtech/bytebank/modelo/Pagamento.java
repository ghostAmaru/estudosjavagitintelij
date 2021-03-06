package br.com.brrtech.bytebank.modelo;

import java.time.LocalDate;

public class Pagamento {
    private String descricao;
    private Tipo tipo;
    private double valor;
    private LocalDate data;

    public Pagamento(Tipo tipo, double valor, String descricao){
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDate.now();
    }

    public String getDescricao(){ return descricao;}

    public void setDescricao(String descricao){ this.descricao = descricao;}

    public Tipo getTipo(){
        return tipo;
    }

    public void setTipo(Tipo tipo){ this.tipo = tipo;}

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){ this.valor = valor; }

    public void setData (LocalDate data){ this.data = data;}

    public LocalDate getData (){ return data;}

    @Override
    public String toString(){
        return "Pagamento{" +
                "descricao= '" + descricao + '\'' +
                ",tipo=" + valor +
                ",valor=" + valor +
                ", data=" + data +
                '}';
    }

}
