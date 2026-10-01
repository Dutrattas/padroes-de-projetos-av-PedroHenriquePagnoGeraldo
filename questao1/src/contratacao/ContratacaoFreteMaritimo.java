package questao1.contratacao;

import questao1.frete.Frete;
import questao1.frete.FreteMaritimo;

public class ContratacaoFreteMaritimo extends ContratacaoFrete {

    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteMaritimo(valorCarga);
    }
}
