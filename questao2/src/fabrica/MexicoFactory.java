package questao2.fabrica;

import questao2.artefato.ComprovanteFiscal;
import questao2.artefato.Pagamento;
import questao2.artefato.TermoPrivacidade;
import questao2.artefato.mexico.ComprovanteFiscalMexico;
import questao2.artefato.mexico.PagamentoSpei;
import questao2.artefato.mexico.TermoPrivacidadeLfpdppp;

public class MexicoFactory implements PaisFactory {

    @Override
    public String getPais() {
        return "mexico";
    }

    @Override
    public String getMoeda() {
        return "MXN";
    }

    @Override
    public ComprovanteFiscal criarComprovanteFiscal(String cliente, double valor) {
        return new ComprovanteFiscalMexico(cliente, valor);
    }

    @Override
    public Pagamento criarPagamento(String cliente, double valor) {
        return new PagamentoSpei(cliente, valor);
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade(String cliente) {
        return new TermoPrivacidadeLfpdppp(cliente);
    }
}
