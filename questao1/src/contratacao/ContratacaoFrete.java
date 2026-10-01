package questao1.contratacao;

import questao1.frete.Frete;

public abstract class ContratacaoFrete {

    protected abstract Frete criarFrete(double valorCarga);

    public final String contratar(String cliente, double valorCarga) {
        if (cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("informe o nome do cliente");
        }

        Frete frete = criarFrete(valorCarga);
        frete.calcularValor();

        return frete.gerarResumo(cliente);
    }
}
