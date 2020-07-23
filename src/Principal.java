import br.com.brrtech.bytebank.io.LeitorCSV;
import br.com.brrtech.bytebank.modelo.Funcionario;
import br.com.brrtech.bytebank.modelo.Pagamento;
import br.com.brrtech.bytebank.registrador.RegistroDePagamento;
import br.com.brrtech.bytebank.visualizador.OpcoesDePagamento;
import br.com.brrtech.bytebank.visualizador.OpcoesDePagamento;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static br.com.brrtech.bytebank.modelo.Tipo.CREDITO;
import static br.com.brrtech.bytebank.modelo.Tipo.DEBITO;

public class Principal {
    public static void main(String[] args) throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);

        for (Pagamento pagamento:
                pagamentos) {

            double valorBruto = pagamento.getValor();

            if (valorBruto > 100) {
                double valorComAcrescimo = valorBruto * 1.1;

                pagamento.setValor(valorComAcrescimo);
        }

            System.out.println(pagamento);
        }






//         new OpcoesDePagamento().mensagemDeBoasVindas();
//        System.out.println("Bem vindo ao Bytebank Estudando o INTELIJ \n");
//        System.out.println("Imprimindo informações dos Funcionários");
//
//        Funcionario jose = new Funcionario("José",1, LocalDate.of(1987,03,29));
//        Funcionario maria = ne2w Funcionario("Maria",2, LocalDate.of(1985,07,17));
//
//        System.out.println("Está sendo impressa as informações de: " + maria);
//        System.out.println("Está sendo impressa as informações de: " + jose);
//
//        System.out.println("---------------------------------------------------------------------------\n");
//        System.out.println("Imprimindo informações de Pagamento");
//
//        Pagamento almoco = new Pagamento("Feijoada da RO",DEBITO,29.90,LocalDate.of(2020,07,10));
//        Pagamento sesta = new Pagamento("Café da tarde na cantina da MJ" ,CREDITO,19.50,LocalDate.of(2020,07,10));
//
//        List<Pagamento> pagamentos = Arrays.asList(almoco, sesta);
//
//        RegistroDePagamento registrador = new RegistroDePagamento();
//        registrador.registra(pagamentos);

    }
}
