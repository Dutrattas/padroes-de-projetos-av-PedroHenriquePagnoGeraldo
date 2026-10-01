package questao2.artefato.brasil;

import questao2.artefato.Pagamento;

public class PagamentoPix implements Pagamento {

    private final String cliente;
    private final double valor;

    public PagamentoPix(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public String processar() {
        return "pagamento: pix";
    }
}
