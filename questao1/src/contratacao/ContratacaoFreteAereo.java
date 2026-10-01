package questao1.contratacao;

import questao1.frete.Frete;
import questao1.frete.FreteAereo;

public class ContratacaoFreteAereo extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteAereo(valorCarga);
    }
}
