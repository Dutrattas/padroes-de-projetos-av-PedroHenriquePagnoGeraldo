package questao1.frete;

public class FreteAereo extends Frete {

    private static final double PERCENTUAL = 6.0;

    public FreteAereo(double valorCarga) {
        super(valorCarga);
    }

    @Override
    public String getModalidade() {
        return "aereo";
    }

    @Override
    public double getPercentual() {
        return PERCENTUAL;
    }

    @Override
    public String[] getDocumentosExigidos() {
        return new String[] { "AWB" };
    }
}
