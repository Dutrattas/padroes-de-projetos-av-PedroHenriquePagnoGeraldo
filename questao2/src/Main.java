package questao2;

import questao2.fabrica.BrasilFactory;
import questao2.fabrica.MexicoFactory;
import questao2.fabrica.PaisFactory;

public class Main {

    public static void main(String[] args) {
        PaisFactory brasil = new BrasilFactory();
        PaisFactory mexico = new MexicoFactory();

        Assinatura assinaturaBrasil = new Assinatura(brasil, "joao", "plano mensal", 499.00);
        Assinatura assinaturaMexico = new Assinatura(mexico, "maria", "plano mensal", 1899.00);

        System.out.println("assinatura no brasil");
        System.out.println(assinaturaBrasil.ativar());

        System.out.println("assinatura no mexico");
        System.out.println(assinaturaMexico.ativar());
    }
}
