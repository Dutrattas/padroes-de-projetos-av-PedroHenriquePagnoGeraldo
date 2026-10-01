package questao1.frete;

public class FreteMaritimo extends Frete {

    private static final double PERCENTUAL = 1.0;

    public FreteMaritimo(double valorCarga) {
        super(valorCarga);
    }

    @Override
    public String getModalidade() {
        return "maritimo";
    }

    @Override
    public double getPercentual() {
        return PERCENTUAL;
    }

    @Override
    public String[] getDocumentosExigidos() {
        return new String[] { "BL", "fatura comercial" };
    }
}
