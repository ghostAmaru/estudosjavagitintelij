package br.com.brrtech.bytebank.validador;

import br.com.brrtech.bytebank.modelo.Pagamento;
import br.com.brrtech.bytebank.modelo.Tipo;

import java.util.List;

public class ValidaPagamento {
    public ValidaPagamento() {
    }

    public void verificaTipo(Pagamento pagamento) {
        if (pagamento.getTipo().equals(Tipo.CREDITO)) {
            pagamento.setValor(pagamento.getValor() * 1.02);
        }
        if (pagamento.getTipo().equals(Tipo.DEBITO)) {
            pagamento.setValor(pagamento.getValor() * 1.001);
        }
    }

    public void verificaTipo(List<Pagamento> pagamentos) {
        for (Pagamento pagamento :
             pagamentos) {
            verificaTipo(pagamento);
        }
    }
}