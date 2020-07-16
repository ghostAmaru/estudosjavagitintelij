package br.com.brrtech.bytebank.visualizador;

import br.com.brrtech.bytebank.io.LeitorCSV;
import br.com.brrtech.bytebank.modelo.Pagamento;
import br.com.brrtech.bytebank.servico.ServicoPagamento;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OpcoesDePagamento {

    public void mensagemDeBoasVindas(){
        System.out.println("Bem vindo ao Byte Bank");
        leituraDeArquivo();
    }

    private void leituraDeArquivo(){
        System.out.println("Informe o número do arquivo que deseja registar os pagamentos");

        LeitorCSV leitor = new LeitorCSV();

        apresentaArquivosDisponiveis(leitor);

        try {
            int codigoDoArquivo = pedeCodigo();

            List<Pagamento> pagamentos = leitor.ler(codigoDoArquivo);
            ServicoPagamento registro = new ServicoPagamento();
            registro.registra(pagamentos);
        } catch (NoSuchFileException | NoSuchElementException e){
            System.out.println("Arquivo não encontrado");
        } catch (IOException | NullPointerException e){
            System.out.println("Erro na leitura do arquiv¹o");
        }
    }

    private void apresentaArquivosDisponiveis(LeitorCSV leitor){
        try {
            Iterator<Path> lista = leitor.lista();
            int i =1;
            while (lista.hasNext()){
                Path caminho = lista.next();
                System.out.println(i++ + " - " + caminho.getFileName().toString());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private int pedeCodigo(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
