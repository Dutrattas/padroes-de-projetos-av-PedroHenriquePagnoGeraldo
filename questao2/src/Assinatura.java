package questao2;

import java.util.Locale;

import questao2.artefato.ComprovanteFiscal;
import questao2.artefato.Pagamento;
import questao2.artefato.TermoPrivacidade;
import questao2.fabrica.PaisFactory;

public class Assinatura {

    private final PaisFactory pais;
    private final String cliente;
    private final String plano;
    private final double valorMensal;

    public Assinatura(PaisFactory pais, String cliente, String plano, double valorMensal) {
        this.pais = pais;
        this.cliente = cliente;
        this.plano = plano;
        this.valorMensal = valorMensal;
    }

    public String ativar() {
        ComprovanteFiscal comprovante = pais.criarComprovanteFiscal(cliente, valorMensal);
        Pagamento pagamento = pais.criarPagamento(cliente, valorMensal);
        TermoPrivacidade termo = pais.criarTermoPrivacidade(cliente);

        String relatorio = "assinatura ativada\n";
        relatorio += "cliente: " + cliente + "\n";
        relatorio += "plano: " + plano + "\n";
        relatorio += "valor mensal: " + pais.getMoeda() + " "
                + String.format(Locale.ROOT, "%.2f", valorMensal) + "\n";
        relatorio += comprovante.emitir() + "\n";
        relatorio += pagamento.processar() + "\n";
        relatorio += termo.gerar() + "\n";
        return relatorio;
    }
}
