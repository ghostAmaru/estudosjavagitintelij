package br.com.brrtech.bytebank.io.teste;

import br.com.brrtech.bytebank.io.Leitor;
import br.com.brrtech.bytebank.io.LeitorCSV;
import br.com.brrtech.bytebank.modelo.Pagamento;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class LeitorCSVTest {

    @Test
    public void pagamentosDeAbril() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);
        assertEquals(5,pagamentos.size());
    }

    @Test
    public void pagamentosDeMaio() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(2);
        assertEquals(5,pagamentos.size());
    }

    @Test
    public void pagamentosDeJunho() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(3);
        assertEquals(5,pagamentos.size());
    }

    @Test
    public void pagamentosDeJulho() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(4);
        assertEquals(5,pagamentos.size());
    }
}