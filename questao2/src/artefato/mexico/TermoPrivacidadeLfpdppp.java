package questao2.artefato.mexico;

import questao2.artefato.TermoPrivacidade;

public class TermoPrivacidadeLfpdppp implements TermoPrivacidade {

    private final String cliente;

    public TermoPrivacidadeLfpdppp(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String gerar() {
        return "termo de privacidade: LFPDPPP";
    }
}
