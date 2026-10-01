package questao1.contratacao;

import questao1.frete.Frete;
import questao1.frete.FreteRodoviario;

public class ContratacaoFreteRodoviario extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteRodoviario(valorCarga);
    }
}
