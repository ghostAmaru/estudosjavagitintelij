package br.com.brrtech.bytebank.io;

import br.com.brrtech.bytebank.modelo.Pagamento;

import java.io.IOException;
import java.util.List;

public interface LeitorPagamento {
    List<Pagamento> ler(int codigo) throws IOException;
}
