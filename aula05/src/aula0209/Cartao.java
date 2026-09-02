package aula0209;

public class Cartao implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado no cartão: R$ " + valor);
    }
}
