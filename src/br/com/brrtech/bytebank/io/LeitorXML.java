package br.com.brrtech.bytebank.io;

import br.com.brrtech.bytebank.modelo.Pagamento;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class LeitorXML extends Leitor implements LeitorPagamento {

    @Override
    public List<Pagamento> ler(int codigo) throws IOException {
        return null;
    }

    @Override
    public Iterator<Path> lista() throws IOException {
        return super.lista();
    }
}
