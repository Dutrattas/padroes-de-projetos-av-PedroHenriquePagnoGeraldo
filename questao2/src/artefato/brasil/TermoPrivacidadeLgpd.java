package questao2.artefato.brasil;

import questao2.artefato.TermoPrivacidade;

public class TermoPrivacidadeLgpd implements TermoPrivacidade {

    private final String cliente;

    public TermoPrivacidadeLgpd(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String gerar() {
        return "termo de privacidade: LGPD";
    }
}
