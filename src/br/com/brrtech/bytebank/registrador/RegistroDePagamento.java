package br.com.brrtech.bytebank.registrador;

import br.com.brrtech.bytebank.modelo.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamento {

    private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();

    public void registra(List<Pagamento> pagamentos) {
        for (Pagamento pagamento : pagamentos ) {
            salva(pagamento);
        }
    }

    private void salva(Pagamento pagamento) {
        PAGAMENTOS.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }

    public void exibeEfetuados() {
        if (PAGAMENTOS.isEmpty()) {
            System.out.println("Não temos pagamento ");
        } else {
            System.out.println("Todos os pagamentos");
            for (Pagamento pagamentosRegistrados : PAGAMENTOS) {
                System.out.println(pagamentosRegistrados);
            }
        }
    }

}
