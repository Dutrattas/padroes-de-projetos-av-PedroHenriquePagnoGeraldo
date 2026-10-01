package questao1.frete;

public class FreteRodoviario extends Frete {

    private static final double PERCENTUAL = 2.0;

    public FreteRodoviario(double valorCarga) {
        super(valorCarga);
    }

    @Override
    public String getModalidade() {
        return "rodoviario";
    }

    @Override
    public double getPercentual() {
        return PERCENTUAL;
    }

    @Override
    public String[] getDocumentosExigidos() {
        return new String[] { "CT-e", "MDF-e" };
    }
}
