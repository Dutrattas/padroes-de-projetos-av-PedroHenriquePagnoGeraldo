package questao2.artefato.mexico;

import java.util.Locale;

import questao2.artefato.ComprovanteFiscal;

public class ComprovanteFiscalMexico implements ComprovanteFiscal {

    private final String cliente;
    private final double valor;

    public ComprovanteFiscalMexico(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public String emitir() {
        double iva = valor * 16 / 100;
        return "comprovante fiscal: CFDI, IVA de " + String.format(Locale.ROOT, "%.2f", iva);
    }
}
