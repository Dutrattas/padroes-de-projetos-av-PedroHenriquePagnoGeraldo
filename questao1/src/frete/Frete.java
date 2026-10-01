package questao1.frete;

import java.util.Locale;

public abstract class Frete {

    private final double valorCarga;

    protected Frete(double valorCarga) {
        if (valorCarga <= 0) {
            throw new IllegalArgumentException("valor da carga invalido");
        }
        this.valorCarga = valorCarga;
    }

    public abstract String getModalidade();

    public abstract double getPercentual();

    public abstract String[] getDocumentosExigidos();

    public final double getValorCarga() {
        return valorCarga;
    }

    public final double calcularValor() {
        return valorCarga * getPercentual() / 100.0;
    }

    public final String gerarResumo(String cliente) {
        String resumo = "modalidade: " + getModalidade() + "\n";
        resumo += "cliente: " + cliente + "\n";
        resumo += "valor da carga: R$ " + String.format(Locale.ROOT, "%.2f", valorCarga) + "\n";
        resumo += "valor do frete: R$ " + String.format(Locale.ROOT, "%.2f", calcularValor()) + "\n";
        resumo += "documentos exigidos: " + String.join(", ", getDocumentosExigidos()) + "\n";
        return resumo;
    }
}
