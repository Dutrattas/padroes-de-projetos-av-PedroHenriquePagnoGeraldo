package questao2.fabrica;

import questao2.artefato.ComprovanteFiscal;
import questao2.artefato.Pagamento;
import questao2.artefato.TermoPrivacidade;
import questao2.artefato.brasil.ComprovanteFiscalBrasil;
import questao2.artefato.brasil.PagamentoPix;
import questao2.artefato.brasil.TermoPrivacidadeLgpd;

public class BrasilFactory implements PaisFactory {

    @Override
    public String getPais() {
        return "brasil";
    }

    @Override
    public String getMoeda() {
        return "R$";
    }

    @Override
    public ComprovanteFiscal criarComprovanteFiscal(String cliente, double valor) {
        return new ComprovanteFiscalBrasil(cliente, valor);
    }

    @Override
    public Pagamento criarPagamento(String cliente, double valor) {
        return new PagamentoPix(cliente, valor);
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade(String cliente) {
        return new TermoPrivacidadeLgpd(cliente);
    }
}
