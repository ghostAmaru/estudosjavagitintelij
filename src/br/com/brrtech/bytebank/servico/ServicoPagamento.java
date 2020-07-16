package br.com.brrtech.bytebank.servico;

import br.com.brrtech.bytebank.modelo.Pagamento;
import br.com.brrtech.bytebank.registrador.RegistroDePagamento;
import br.com.brrtech.bytebank.validador.ValidaPagamento;

import java.util.List;

public class ServicoPagamento {

    RegistroDePagamento registro = new RegistroDePagamento();

    public void registra(List<Pagamento> pagamentos) {
        ValidaPagamento validador = new ValidaPagamento();
        validador.verificaTipo(pagamentos);
        registro.registra(pagamentos);
    }

    public void exibeEfetuados() {
        registro.exibeEfetuados();
    }
}
