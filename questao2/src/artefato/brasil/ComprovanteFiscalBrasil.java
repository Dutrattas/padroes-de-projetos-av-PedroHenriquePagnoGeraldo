package questao2.artefato.brasil;

import java.util.Locale;

import questao2.artefato.ComprovanteFiscal;

public class ComprovanteFiscalBrasil implements ComprovanteFiscal {

    private final String cliente;
    private final double valor;

    public ComprovanteFiscalBrasil(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public String emitir() {
        double iss = valor * 5 / 100;
        return "comprovante fiscal: NFS-e, ISS de " + String.format(Locale.ROOT, "%.2f", iss);
    }
}
