package aula0209;

public class Pix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via PIX: R$ " + valor);
    }
}