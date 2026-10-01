package questao1;

import java.util.Locale;

import questao1.contratacao.ContratacaoFrete;
import questao1.contratacao.ContratacaoFreteAereo;
import questao1.contratacao.ContratacaoFreteMaritimo;
import questao1.contratacao.ContratacaoFreteRodoviario;

public class Main {

    public static void main(String[] args) {
        String cliente = "Transportadora uniLE";
        double valorCarga = 25000.00;

        ContratacaoFrete rodoviario = new ContratacaoFreteRodoviario();
        ContratacaoFrete aereo = new ContratacaoFreteAereo();
        ContratacaoFrete maritimo = new ContratacaoFreteMaritimo();

        System.out.println("contratacao de frete - cliente: " + cliente);
        System.out.println("valor da carga: R$ " + String.format(Locale.ROOT, "%.2f", valorCarga));
        System.out.println();

        System.out.println(rodoviario.contratar(cliente, valorCarga));
        System.out.println(aereo.contratar(cliente, valorCarga));
        System.out.println(maritimo.contratar(cliente, valorCarga));
    }
}
