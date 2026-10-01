package questao2.fabrica;

import questao2.artefato.ComprovanteFiscal;
import questao2.artefato.Pagamento;
import questao2.artefato.TermoPrivacidade;

public interface PaisFactory {

    String getPais();

    String getMoeda();

    ComprovanteFiscal criarComprovanteFiscal(String cliente, double valor);

    Pagamento criarPagamento(String cliente, double valor);

    TermoPrivacidade criarTermoPrivacidade(String cliente);
}
