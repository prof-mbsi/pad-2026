package aula0209;

public class Boleto implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado por boleto: R$ " + valor);
    }
}
