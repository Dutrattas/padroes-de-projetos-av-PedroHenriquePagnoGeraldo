package questao2.artefato.mexico;

import questao2.artefato.Pagamento;

public class PagamentoSpei implements Pagamento {

    private final String cliente;
    private final double valor;

    public PagamentoSpei(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public String processar() {
        return "pagamento: SPEI";
    }
}
